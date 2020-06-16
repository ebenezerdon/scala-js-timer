enablePlugins(ScalaJSPlugin)
// enablePlugins(SbtTwirl)

name := "Scala.js test-app"
scalaVersion := "2.13.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// mainClass in Compile := Some("Index.scala")

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.9.1"
