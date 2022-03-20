import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import org.apache.spark.sql.{Dataset, Encoder, Encoders, SparkSession}

import scala.io.Source
import ru.yarsstock.fetcher.dto.Fetcher._
import ru.yarsstock.fetcher.dto.Symbols._

import java.sql.SQLException

val spark = SparkSession.builder()
  .appName("Spark Job for Fetcher")
  .config("spark.master", "local")
  .getOrCreate()

val conf = Source.fromResource("fetcher.json").getLines().mkString("\n")

val config: Fetcher = decode[Fetcher](conf) match {
  case Left(err)  => throw err
  case Right(value) => value
}

def getSymbols: List[Symbol] = {
  val url = config.api.url ++ config.api.functions.filter(_.name == "list_symbols").head.value
  decode[Symbols](Source.fromURL(url).getLines.mkString("\n")) match {
    case Left(err)  => throw err
    case Right(value) => value.data
  }
}

def overwriteData[A: Encoder](data: List[A]): Unit = {
  try {
    import spark.sqlContext.implicits._
    val ds: Dataset[A] = data.toDF.as[A]
    ds.show(10, false)
  } catch  {
    case e: SQLException => println(e)
  }
}

implicit val encoder = Encoders.product[Symbol]
overwriteData(getSymbols)

