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

  "simple partition" should "partition elements into less than pivot, pivot, and greater than pivot" in {
    val array = Array(4,1,2,7,9)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(1,2,4,7,9)
  }
  it should "partition when all elements are less than pivot" in {
    val array = Array(9,1,2,7,0,5)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(1,2,7,0,5,9)
  }

  it should "partition when all elements are greater than pivot" in {
    val array = Array(9,10,20,70,10,50)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(9,10,20,70,10,50)
  }

  it should "work for small arrays" in {
    val array = Array(9,10)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(9,10)
  }
  it should "work for v small arrays" in {
    val array = Array(9)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(9)
  }
  it should "not blow up if array is empty" in {
    val array: Array[Int] = Array()
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array shouldBe empty
  }

  "fat partition" should "partition elements into less than pivot, pivot group, and greater than pivot" in {
    val array = Array(4,4,4,1,2,7,9)
    MajorityElement.partitionSimple(array, 0, array.length - 1)
    array should contain theSameElementsInOrderAs Array(1,2,4,4,4,7,9)
  }
}
