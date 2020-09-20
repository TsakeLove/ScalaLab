package recfun

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExptSuite extends FunSuite {

  import Main.exponent

  test("exponent: b=0, n=2") {
    assert(exponent(0, 2) === 1)
  }

  test("exponent: b=2,n=3") {
    assert(exponent(2, 3) === 8)
  }

  test("exponent: b=2,n=20") {
    assert(exponent(2, 20) === 1048576)
  }

  test("exponent: b=2,n=30") {
    assert(exponent(2, 30) === 1073741824)
  }

}
