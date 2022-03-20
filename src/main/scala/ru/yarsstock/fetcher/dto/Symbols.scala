package ru.yarsstock.fetcher.dto

object Symbols {
  case class Symbols(data: List[Symbol])

  case class Symbol(symbol: String, name: String, currency: String, exchange: String, country: String, `type`: String)
}
