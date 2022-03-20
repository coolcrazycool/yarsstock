package ru.yarsstock.fetcher.dto

object DatabaseConnection {
  case class DatabaseConnections(databases: List[DatabaseConnection])

  case class DatabaseConnection(`type`: String, driver: String, url: String, user: String, password: String)
}
