package ru.yarsstock.fetcher.dto

object Fetcher {
  case class Fetcher(api: Api)

  case class Api(url: String,
                 apiToken: String,
                 functions: List[Function],
                 schemas: List[Schema])

  case class Function(name: String, value: String)

  case class Schema(name: String, fields: List[Field])

  case class Field(name: String, `type`: String)
}
