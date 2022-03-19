package ru.yarsstock.fetcher

import org.apache.spark.sql.SparkSession
import ru.tinkoff.piapi.core.InvestApi

package object commons extends App {
  val spark: SparkSession = SparkSession.builder().getOrCreate()
  var token = "t.T58Htyy6fYVFjMfxgy-tn9pxUeDxejJ-WnP-7d3cP7Qw13_IOCSb9aDIbycQYJXgeyjZB3cHFwn_eOn6TwuJpA"
  var api = InvestApi.create(token)

  var order = api.getOrdersService
  println(order)
}
