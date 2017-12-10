package org.nomadblacky.scalatest_repoter_sample

import org.scalatest._

class SampleTest extends FunSuite with Matchers {

  test("Success01") {
    1 + 1 shouldBe 2
  }

  test("Success02") {
    1 - 1 shouldBe 0
  }

  test("Fail01") {
    1 / 0 shouldBe Double.NaN
  }

  test("Success03") {
    1 * 2 shouldBe 2
  }

  test("Fail02") {
    val maybe: Option[Int] = None
    maybe.get shouldBe 0
  }
}
