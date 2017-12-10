package org.nomadblacky.scalatest_repoter_sample

import org.scalatest.Reporter
import org.scalatest.events._

class SampleReporter extends Reporter {
  override def apply(event: Event): Unit = event match {
    case e: TestSucceeded =>
      println(s"OK: ${e.suiteName} ${e.testName} ${getLocation(e.location)}")

    case e: TestFailed =>
      println(s"NG: ${e.suiteName} ${e.testName} ${getLocation(e.location)} [${e.message}]")

    case _ => // Do Nothing
  }

  private def getLocation(location: Option[Location]): String = location
    .collect {
      case TopOfClass(clazz)                   => s"$clazz"
      case TopOfMethod(clazz, method)          => s"$clazz#$method"
      case LineInFile(lineNumber, fileName, _) => s"$fileName$$L$lineNumber"
    }
    .getOrElse("(Unknown)")
}
