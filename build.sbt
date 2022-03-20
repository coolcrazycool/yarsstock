name := "yarsstock"

version := "0.1"

scalaVersion := "2.13.6"

val sparkVersion = "3.2.1"
val Http4sVersion = "1.0.0-M21"
val ZioCatsVersion = "2.0.0.0-RC12"
val typesafeVersion = "1.4.2"
val circeVersion = "0.14.1"

libraryDependencies ++= Seq(
  "com.typesafe"       % "config"           % typesafeVersion,
  "io.circe"          %% "circe-core"       % circeVersion,
  "io.circe"          %% "circe-generic"    % circeVersion,
  "io.circe"          %% "circe-parser"     % circeVersion,

  "org.apache.spark"  %% "spark-core"       % sparkVersion,
  "org.apache.spark"  %% "spark-sql"        % sparkVersion
)