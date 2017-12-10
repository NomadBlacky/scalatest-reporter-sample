lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.nomadblacky",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scalatest-reporter-sample",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.3"
    ),
    testOptions in Test ++= Seq(
      Tests.Argument(TestFrameworks.ScalaTest, "-C", "org.nomadblacky.scalatest_repoter_sample.SampleReporter")
    )
  )
