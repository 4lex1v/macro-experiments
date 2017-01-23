import scala.Console.{GREEN, RESET}

name         := "Anyfin"
organization := "io.github.4lex1v"
description  := "Opinionated way to improving FP experience with Metaprogramming"

scalaVersion := "2.11.8"
scalaOrganization := "org.typelevel"

resolvers += Resolver.url("scalameta", url("http://dl.bintray.com/scalameta/maven"))(Resolver.ivyStylePatterns)
libraryDependencies ++= Seq(
  compilerPlugin("org.scalameta" %% "paradise" % "3.0.0.152" cross CrossVersion.full)
)

scalacOptions ++= Seq(
  "-language:_",
  "-Xplugin-require:macroparadise"
)

shellPrompt := { s => s"$GREEN[${Project.extract(s).currentProject.id}]$RESET >> " }
