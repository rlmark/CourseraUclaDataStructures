import org.scalatest.{FlatSpec, Matchers}

class BinarySearchSpec extends FlatSpec with Matchers{
  "Binary Search" should "find value when present" in {
    val list = Vector(1, 3, 5, 7, 9, 45, 100)
    BinarySearch.binarySearch(list, 7) shouldBe 3
  }
  it should "return -1 when not found" in {
    val list = Vector(1, 3, 5, 7, 9, 45, 100)
    BinarySearch.binarySearch(list, 4) shouldBe -1
  }
  it should "find value in right side of array when array is even" in {
    val list = Vector(0, 1, 2, 3, 4, 5)
    BinarySearch.binarySearch(list, 4) shouldBe 4
  }
  it should "find value in left side of array when array is even" in {
    val list = Vector(0, 1, 2, 3, 4, 5)
    BinarySearch.binarySearch(list, 1) shouldBe 1
  }
  it should "work for odd arrays" in {
    val list = Vector(1, 3, 5, 7, 9, 45, 100, 102, 109)
    BinarySearch.binarySearch(list, 100) shouldBe 6
  }
  it should "work for beginning of array" in {
    val list = Vector(1, 5, 8, 12, 13)
    val valuesToFind = Vector(8, 1, 23, 1, 11)
    BinarySearch.binarySearch(list, 1) shouldBe 0

  }
  it should "work for end of array" in {
    val list = Vector(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    BinarySearch.binarySearch(list, 11) shouldBe 9
  }
}
