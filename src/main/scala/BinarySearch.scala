import java.util._
import scala.collection.immutable.Vector

object BinarySearch {

  def linearSearch(sortedArray: Vector[Int], x: Int) {
    var i = 0
    var answer = -1
    while(i < sortedArray.length){
      if(sortedArray(i) == x) answer = i
      i += 1
    }
    answer
  }

  def binarySearch(a: Vector[Int], x: Int): Int = {

    var low = 0
    var high = a.length
    var answer = -1
    var mid = high / 2

    // while the high pointer is more than 1 away from low
    while(high != low){
//      println("high is " + high)
//      println("mid is " + mid)
//      println("low is " + low)
      var valAtMid = a(mid)
      if(valAtMid == x) {answer = mid; return answer}
      if(x < valAtMid){
        // look to the left
        high = mid
        mid = high / 2
      }
      if(x > valAtMid){
        // look to the right

        // The low value is now the midpoint
        low = mid + 1
        val tmp = (high - low) / 2
        mid = tmp + low
      }

    }
    answer
  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt() // Number of elements in sorted array
    var sortedArray: Vector[Int] = Vector()
    var i = 0
    while(i < n){
      sortedArray :+= scanner.nextInt()
      i += 1
    }

    val m = scanner.nextInt() // Number of elements in array to find
    var findElements: Vector[Int] = Vector()
    var j = 0
    while( j < m ){
      findElements :+= scanner.nextInt
      j += 1
    }
    var k = 0
    while (k < m){
      print(binarySearch(sortedArray, findElements(k)) + " ")

      k += 1
    }
  }
}
