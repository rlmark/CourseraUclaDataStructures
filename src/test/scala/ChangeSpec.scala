import org.scalatest.{FlatSpec, Matchers}

class ChangeSpec extends FlatSpec with Matchers {
  "Change" should "calculate the minimum bills for a given int" in {
    val result = Change.getChange(28)
    result shouldBe 6
  }
  it should "work on larger numbers" in {
    val result = Change.getChange(1002)
    result shouldBe 102
  }
  it should "work on larger numbers 2" in {
    val result = Change.getChange(1051)
    result shouldBe 106
  }
}
