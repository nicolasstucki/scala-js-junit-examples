resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"


lazy val testSuite = project.in(file("test-suite")).
  enablePlugins(ScalaJSPlugin).
  settings(
    scalaVersion := "2.11.7",
    name := "Scala.js JUnit test",
    libraryDependencies ++= Seq(
      "scala-js-junit" % "scala-js-junit_sjs0.6_2.11" % "0.0.1-SNAPSHOT" % "test",
      "scala-js-junit-plugin" % "scala-js-junit-plugin_2.11" % "0.0.1-SNAPSHOT" % "plugin"),
    testFrameworks += new TestFramework("org.scalajs.junit.JUnitFramework"),
    testOptions += Tests.Argument(new TestFramework("org.scalajs.junit.JUnitFramework"), "-v" /*, "-q", "-n", "-a", "-c" */)
  )
  