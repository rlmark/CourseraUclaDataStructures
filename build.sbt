import sbt.Keys._

name := "CourseraUclaDSA"

version := "1.0"

scalaVersion := "2.11.4"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"


libraryDependencies ++= Seq(
  "org.mockito"   % "mockito-core"     % "1.9.5",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
