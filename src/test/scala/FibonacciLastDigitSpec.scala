import org.scalatest.FlatSpec

class FibonacciLastDigitSpec extends FlatSpec {
  "FibonacciLastDigit" should "have naive solution" in {
    val result = FibonacciLastDigit.getFibLastDigit(331)
    assert(result == 9)
  }

  it should "handle small numbers" in {
    val result = FibonacciLastDigit.getFibLastDigit(2)
    assert(result == 1 )
  }
  it should "handle large numbers" in {
    val result = FibonacciLastDigit.getFibLastDigit(327305)
    assert(result == 5 )
  }

}
