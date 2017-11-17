import org.scalatest.FlatSpec


class MaxPairwiseProductSpec extends FlatSpec {
  "MaxPairwiseProduct" should "find max" in {
    val arr = Array(1,2,3)
    val result = MaxPairwiseProduct.getMaxPairwiseProduct3(arr)
    assert(result == 6)
  }
}
