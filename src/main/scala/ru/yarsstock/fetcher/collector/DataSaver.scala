package ru.yarsstock.fetcher.collector

import io.circe.generic.auto._
import io.circe.parser.decode
import org.apache.spark.sql.{Dataset, Encoder, SaveMode}
import org.apache.spark.sql.SaveMode.{Overwrite, Append}
import ru.yarsstock.fetcher.dto.DatabaseConnection._

import java.sql.{Connection, DriverManager, SQLException}
import java.util.Properties
import scala.io.Source
import ru.yarsstock.fetcher.commons._

class DataSaver {
  private val connect: (String, Connection, Properties) = {
    val config = Source.fromResource("database.json").getLines().mkString("\n")

    decode[DatabaseConnections](config) match {
      case Left(err)  => throw err
      case Right(value) => {
        val database = value.databases.filter(_.`type` == "data").head

        val properties = new Properties

        Class.forName(database.driver)
        properties.put("user", database.user)
        properties.put("password", database.password)

        (
          database.url, DriverManager.getConnection(database.url, database.user, database.password), properties
        )
      }
    }
  }


  def saveData[A: Encoder](data: List[A], table: String, overwrite: Boolean = false): Unit = {
    try {
      import spark.sqlContext.implicits._
      val df: Dataset[A] = data.toDF.as[A]

      df.write
        .mode(if (overwrite) Overwrite else Append)
        .jdbc(connect._1, table, connect._3)
    } catch  {
      case e: SQLException => println(e)
    }
  }

}
