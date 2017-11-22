import org.scalatest.FlatSpec

class LowestCommonMultipleSpec extends FlatSpec {
  "LCM naive" should "find the lcm with naive impl" in {
    val result = LowestCommonMultiple.lcm_naive(5, 3)
    assert(result == 15)
  }
  it should "work for non trivial multiple" in {
    val result = LowestCommonMultiple.lcm_naive(6, 4)
    assert(result == 12)
  }
  "lcm" should "find lcm" in {
    val result = LowestCommonMultiple.lcm(5, 3)
    assert(result == 15)
  }
  it should "work for non trivial multiple" in {
    val result = LowestCommonMultiple.lcm(6, 4)
    assert(result == 12)
  }
  it should "work for large number" in {
    val result = LowestCommonMultiple.lcm(14159572, 63967072)
    assert(result == 226436590403296L)

  }


}
