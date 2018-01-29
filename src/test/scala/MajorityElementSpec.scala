import org.scalatest.{Matchers, FlatSpec}

class MajorityElementSpec extends FlatSpec with Matchers {
  "Basic Majority Element (naive impl)" should "(naive impl) should return 1 if there is a majority element" in {
    val array = Array(1, 4, 2, 1, 1)
    val test = MajorityElement.getMajorityElementNaive(array, 0, array.length)
    test should be(1)
  }
  it should "return -1 if there is exactly half of 1 element (naive impl)" in {
    val array = Array(1, 4, 2, 3, 1, 1)
    val test = MajorityElement.getMajorityElementNaive(array, 0, array.length)
    test should be(-1)
  }
}
