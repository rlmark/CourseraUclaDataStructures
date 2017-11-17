import org.scalatest.FlatSpec


class MaxPairwiseProductSpec extends FlatSpec {
  "MaxPairwiseProduct3" should "find max" in {
    val arr = Array(1,2,3)
    val result = MaxPairwiseProduct.getMaxPairwiseProduct3(arr)
    assert(result == 6)
  }

  it should "find max using 2" in {
    val arr = Array(1,2,3)
    val result = MaxPairwiseProduct.getMaxPairwiseProduct2(arr)
    assert(result == 6)
  }
}
