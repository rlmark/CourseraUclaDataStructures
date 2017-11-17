import org.scalatest.FlatSpec

class FibonacciSpec  extends FlatSpec {
  "fibs simple" should "find nth "in {
    val r = Fibonacci.calcFiBInefficient(6)
    assert(r == 8)
  }
  "Fibs" should "find nth fibs" in {
    val result = Fibonacci.calcFib(6)
    assert(result == 8)
  }
   it should "handle n of 0 " in {
     val result = Fibonacci.calcFib(0)
     assert(result == 0)
   }

}
