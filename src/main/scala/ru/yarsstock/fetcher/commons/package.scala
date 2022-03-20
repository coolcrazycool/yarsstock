package ru.yarsstock.fetcher

import org.apache.spark.sql.SparkSession


package object commons extends App {
  lazy val spark = SparkSession.builder()
    .appName("Spark Job for Fetcher")
    .config("spark.master", "local")
    .getOrCreate()
}
