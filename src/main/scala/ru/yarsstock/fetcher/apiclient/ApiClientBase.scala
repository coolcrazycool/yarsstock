package ru.yarsstock.fetcher.apiclient
import ru.yarsstock.fetcher.dto._

import cats._
import cats.effect._
import cats.implicits._
import org.http4s.circe._
import org.http4s._
import io.circe.generic.auto._
import io.circe.syntax._
import org.http4s.dsl._
import org.http4s.dsl.impl._
import org.http4s.headers._
import org.http4s.implicits._
import org.http4s.server._


object ApiClientBase {
  /*
  - GET all symbols
      Request -> F[Option[Response]] => HttpRoutes[F]
  */

  def symbolRoutes[F[_]]: HttpRoutes[F] = {
    val dsl = Http4sDsl[F]
    import dsl._

    HttpRoutes.of[F] {
      case GET -> Root / "stocks" => ???
    }
  }
}