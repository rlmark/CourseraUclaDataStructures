import java.util.Scanner

object MajorityElement {
  /*
  * 1. Sort the elements (use quicksort)
  *   a.) pick a pivot (start of list is fine)
  *   PARTITION (use Dutch national flag algorithm) Goal is to separate list into 3 parts, less, equal to, greater than. // maybe choose median of sublist as pivot
  *     i.) compare all subsequent elements to pivot
  *     ii.) all elements less than the pivot are placed to the left of the pivot
  *     iii.) all elements greater than the pivot are placed to the right of the pivot
  *     iv.) elements equal to pivot are kept next to pivot
  *   b.) recursively call the sort function twice, once for the left, and once for the right side of the remaining list
  * 2. If the length of any one of the sorted sections is greater than the length/2 of the original list, -1 else 1
  * */

  // TODO: Use Scala Array instead.
  def getMajorityElement(a : Array[Int], left: Int, right: Int): Int = {
    if (left == right) {
      return -1
    }
    if (left + 1 == right) {
      return a(left)
    }
    //write your code here
    return -1

  }

  // test if this even works. implement dutch flag algorithm
  def partitionSimple(as: Array[Int], left: Int, right: Int): Unit = {
    var leftIndex = left + 1
    var rightIndex = right
    while (leftIndex < rightIndex) {
      val pivot = as(left)
        if(as(leftIndex) < pivot){
          leftIndex += 1
        }
        if(as(leftIndex) > pivot){
          if(as(rightIndex) > pivot) rightIndex -= 1
          if(as(rightIndex) < pivot)
            swap(leftIndex, rightIndex)
        }
      swap(left, leftIndex)
    }

    def swap(leftI: Int, rightI: Int): Unit = {
      val temp = as(leftI)
      as(leftI) = as(rightI)
      as(rightI) = temp
    }
  }

  def getMajorityElementNaive(as: Array[Int], left: Int, right: Int): Int = {
    val uniqueElements = as.toSet

//    uniqueElements.fold(-1){(acc, next) =>
//      if (a.count(elem => next == elem) > a.length/2) 1
//      else acc
//    }
    val halfwayMark = as.length / 2
    val maybeMajority = uniqueElements.find { e =>
      val duplicates = as.count(a => a == e)
      duplicates > halfwayMark
    }
    maybeMajority.fold(-1)(_ => 1)
  }

  def getMajorityElementNonSort(as:Vector[Int]): Int = {
    // for each element, put it as a key in map
    // its value is set to 1 the first time,
    // if you find a duplicate, increment count of key the,
    // if the count is over as.length/2, break -1,
    ???
  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    val a: Array[Int] = Array(n)
    var i = 0
    while (i < n){
      a(i) = scanner.nextInt()
      i += 1
    }

    if (getMajorityElement(a, 0, a.length) != -1) {
      System.out.println(1)
    } else {
      System.out.println(0)
    }

  }
}
