
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "code-with-spring-perf-tests",
    idePackagePrefix := Some("com.levimartines")
  )
enablePlugins(GatlingPlugin)
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "3.7.4" % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "3.7.4" % "test"