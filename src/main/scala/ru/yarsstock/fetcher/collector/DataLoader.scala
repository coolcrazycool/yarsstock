package ru.yarsstock.fetcher.collector

import io.circe.generic.auto._
import scala.io.Source
import io.circe.parser._
import ru.yarsstock.fetcher.dto.Fetcher._
import ru.yarsstock.fetcher.dto.Symbols._

class DataLoader {
  private val config: Fetcher = {
    val config = Source.fromResource("fetcher.json").getLines().mkString("\n")

    decode[Fetcher](config) match {
      case Left(err)  => throw err
      case Right(value) => value
    }
  }

  def getSymbols: List[Symbol] = {
    val url = config.api.url ++ config.api.functions.filter(_.name == "list_symbols").head.value
    decode[Symbols](Source.fromURL(url).getLines.mkString("\n")) match {
      case Left(err)  => throw err
      case Right(value) => value.data
    }
  }
}
