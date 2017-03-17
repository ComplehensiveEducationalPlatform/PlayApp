
name := """play-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  filters,
  "mysql" % "mysql-connector-java" % "5.1.36",
  "org.pac4j" % "play-pac4j" % "2.6.0",
  "org.pac4j" % "pac4j-http" % "1.9.4",
  "org.pac4j" % "pac4j-cas" % "1.9.4",
  "org.pac4j" % "pac4j-openid" % "1.9.4" exclude("xml-apis" , "xml-apis"),
  "org.pac4j" % "pac4j-oauth" % "1.9.4",
  "org.pac4j" % "pac4j-saml" % "1.9.4",
  "org.pac4j" % "pac4j-oidc" % "1.9.4" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-gae" % "1.9.4",
  "org.pac4j" % "pac4j-jwt" % "1.9.4" exclude("commons-io" , "commons-io"),
  "org.pac4j" % "pac4j-ldap" % "1.9.4",
  "org.pac4j" % "pac4j-sql" % "1.9.4",
  "org.pac4j" % "pac4j-mongo" % "1.9.4",
  "org.pac4j" % "pac4j-stormpath" % "1.9.4",
  "com.typesafe.play" % "play-cache_2.11" % "2.5.4",
  "commons-io" % "commons-io" % "2.4",
  "be.objectify" %% "deadbolt-java" % "2.5.1"
)

libraryDependencies += "org.twitter4j" % "twitter4j-core" % "4.0.1"

resolvers ++= Seq(
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)
