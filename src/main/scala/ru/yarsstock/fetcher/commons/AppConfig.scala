package ru.yarsstock.fetcher.commons

import com.typesafe.config.ConfigFactory


object AppConfig extends App {
  val conf = ConfigFactory.load()

  val alphavantage_url = conf.getString("alphavantage_api.url")
  val alphavantage_token = conf.getString("alphavantage_api.api_token")
  val alphavantage_daily_function = conf.getString("alphavantage_api.functions.daily_function")

  val financial_modeling_url = conf.getString("financial_modeling_api.url")
  val financial_modeling_token = conf.getString("financial_modeling_api.api_token")
  val financial_modeling_list_function = conf.getString("financial_modeling_api.functions.list_symbols")
}
