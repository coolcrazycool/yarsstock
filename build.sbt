name := "yarsstock"

version := "0.1"

scalaVersion := "2.13.6"

val sparkVersion = "3.0.2"
val Http4sVersion = "1.0.0-M21"
val CirceVersion = "0.14.0-M5"
val DoobieVersion = "0.8.8"
val ZioCatsVersion = "2.0.0.0-RC12"

libraryDependencies ++= Seq(

  "org.http4s"        %% "http4s-blaze-server"   % Http4sVersion,
  "org.http4s"        %% "http4s-circe"          % Http4sVersion,
  "org.http4s"        %% "http4s-dsl"            % Http4sVersion,
  "io.circe"          %% "circe-generic"         % CirceVersion,
  "org.tpolecat"      %% "doobie-core"           % DoobieVersion,
  "org.tpolecat"      %% "doobie-h2"             % DoobieVersion,
  "dev.zio"           %% "zio-interop-cats"      % ZioCatsVersion
)