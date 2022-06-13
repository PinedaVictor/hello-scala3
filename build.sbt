val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-hello",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
libraryDependencies += ("org.apache.spark" %% "spark-sql" % "3.2.0" % "provided")
  .cross(CrossVersion.for3Use2_13)
