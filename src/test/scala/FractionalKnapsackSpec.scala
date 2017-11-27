import org.scalatest.{Matchers, FlatSpec}

class FractionalKnapsackSpec extends FlatSpec with Matchers {
  "FractionalKnapsack" should "pack highest value" in {
    val result = FractionalKnapsack.getOptimalValue(3,Seq(5, 10, 1), Seq(1,1,1))
    result shouldBe ()
  }
  it should "work" in {


    val result = FractionalKnapsack.getOptimalValue(50,Seq(60, 100, 120), Seq(20,50,30))
    result shouldBe 180.0

  }
  it should "work for fracitonal amounts" in {

    val result = FractionalKnapsack.getOptimalValue(10,Seq(500), Seq(30))
    result shouldBe 166.6667
  }
}
