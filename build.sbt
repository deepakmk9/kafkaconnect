import Resolvers._
import Dependencies._

// factor out common settings into a sequence
lazy val buildSettings = Seq(
  organization := "com.kafkaconnect",
  version := "0.1.0",
  scalaVersion := "2.12.4"
)

// Sub-project specific dependencies
lazy val commonDeps = akka ++ Seq(
  akkaFileStream,
  scalatest % "it,test"
)

lazy val connect = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    buildSettings,
    Defaults.itSettings,
    libraryDependencies ++= commonDeps
  ).settings(
  assemblyJarName in assembly := "kafka-connect.jar",
  // more settings here ...
)


