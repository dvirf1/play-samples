enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"
)

scalacOptions := Seq("-Xlint", "-Xfatal-warnings")

// remove unused import from the generated routes
play.sbt.routes.RoutesKeys.routesImport -= "controllers.Assets.Asset"