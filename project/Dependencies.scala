import sbt._
import Keys._

object Dependencies {

  val scalatest = "org.scalatest" %% "scalatest" % "3.0.1"
  val akkaVersion = "2.5.11"


  lazy val akka = Seq("com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion % Test)

  lazy val akkaFileStream = "com.lightbend.akka" %% "akka-stream-alpakka-file" % "0.17"



}