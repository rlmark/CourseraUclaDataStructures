import org.scalatest.FlatSpec

class FibonacciHugeSpec extends FlatSpec {
  "FibHuge" should "calculate large fib numbers modulo a given number naively" in {
    val result = FibonacciHuge.getFibHugeNaive(5, 3)
    assert(result == 2)
  }
  it should "calculate diff numbers naively" in {
    val result = FibonacciHuge.getFibHugeNaive(8, 2)
    assert(result ==1)
  }
  it should "handle 0" in {
    val result = FibonacciHuge.getFibHugeNaive(0, 1)
    assert(result == 0)
  }
  it should "test" in {
    for(i <- 1 to 10){
      print(FibonacciHuge.getFibHugeNaive(i, 21) + " ")
    }
  }
}
