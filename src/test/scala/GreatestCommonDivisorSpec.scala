import org.scalatest.FlatSpec

class GreatestCommonDivisorSpec extends FlatSpec {
  "GreatestCommonDivisor" should "find the GCD" in {
    val result = GreatestCommonDivisor.gcd(1344, 217)
    assert(result == 7)
  }
  it should "find 1 when there is no common divisor other than that" in {
    val result = GreatestCommonDivisor.gcd(1, 1)
    assert(result == 1)
  }

  it should "find 1 when there is no common divisor other than that 2" in {
    val result = GreatestCommonDivisor.gcd(5, 9)
    assert(result == 1)
  }
}
