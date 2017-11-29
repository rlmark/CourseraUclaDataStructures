import org.scalatest.{Matchers, FlatSpec}

class FibonacciHugeSpec extends FlatSpec with Matchers{
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
  it should "find period in naive manner  length for mod 3" in {
    // 0 1 1 2 0 2 2 1
    FibonacciHuge.findPeriodNaive(3) shouldBe 8
  }
  it should "find period in naive manner  length for mod 2" in {
    // 0 1 1
    FibonacciHuge.findPeriodNaive(2) shouldBe 3
  }
  it should "find period in naive manner  length for mod 4" in {
    FibonacciHuge.findPeriodNaive(4) shouldBe 6
  }
  it should "find period in naive manner  length for mod 7" in {
    FibonacciHuge.findPeriodNaive(7) shouldBe 16
  }
  it should "find period in naive manner  length for large mod" in {
    FibonacciHuge.findPeriodNaive(1000) shouldBe 6
  }
  it should "work for non trivial inputs" in {
    val result = FibonacciHuge.getFibHuge(2015,3)
    result shouldBe 1
  }
  it should "work for small numbers" in {
    val r = FibonacciHuge.getFibHuge(1, 5)
    r shouldBe 1
  }
  it should "work for long numbers" in {
    val result = FibonacciHuge.getFibHuge(239, 1000)
    result shouldBe 161
  }
}
