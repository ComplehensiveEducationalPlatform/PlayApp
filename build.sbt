<<<<<<< HEAD
name := """PlayApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
=======
name := """play-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
>>>>>>> 0695af9fc3c6bdd4ff6454f8ead6ba554142c267

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
<<<<<<< HEAD
  javaWs,
  filters
=======
  javaWs
>>>>>>> 0695af9fc3c6bdd4ff6454f8ead6ba554142c267
)
