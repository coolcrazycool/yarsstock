package ru.yarsstock.fetcher.collector

import org.apache.spark.sql.DataFrame
import ru.yarsstock.fetcher.commons.AppConfig

import scala.io.Source
import scala.util.{Failure, Success, Using}

class DataLoader {
//  def load(symbol: String): DataFrame = {
//
//  }
//
//  def getAllTickets(): String = {
//    val url = AppConfig.financial_modeling_url ++
//      s"/${AppConfig.financial_modeling_list_function}" ++
//      s"?apikey=${AppConfig.financial_modeling_token}"
//
//    Using(Source.fromURL(url)) { source => source.mkString} match {
//      case Success(json) => json
//      case Failure(exception) => println(exception)
//    }
//  }
}
