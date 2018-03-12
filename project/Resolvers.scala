import sbt._
import Keys._

object Resolvers {
  val sunrepo    = "Sun Maven2 Repo" at "http://download.java.net/maven/2"
  val sunrepoGF  = "Sun GF Maven2 Repo" at "http://download.java.net/maven/glassfish"
  val oraclerepo = "Oracle Maven2 Repo" at "http://download.oracle.com/maven"
  val assemblyResolver = "bintray-sbt-plugins" at "http://dl.bintray.com/sbt/sbt-plugin-releases"


  val oracleResolvers = Seq(sunrepo, sunrepoGF, oraclerepo, assemblyResolver)
}