package Week1

import java.util._
import java.io._

object MaxPairwiseProduct {
  def getMaxPairwiseProduct1(numbers: Array[Int]): Int = {
    var result: Int = 0
    val n: Int = numbers.length
    var i: Int = 0
    while (i < n) {
      var j: Int = i + 1
      while (j < n) {
        if (numbers(i) * numbers(j) > result) {
          result = numbers(i) * numbers(j)
        }
        j += 1
      }
      i += 1
    }
    result
  }

  // Cheating with scala types
  def getMaxPairwiseProduct2(numbers: Array[Long]): Long = {
    val numbersWithIndex = numbers.zipWithIndex

    var currentMaxIndex: Long = -1
    var currentMax: Long = -1
    numbersWithIndex.foreach{ case(n, index) =>
      if(n > currentMax){
        currentMax = n
        currentMaxIndex = index
      }
    }

    var secondMax: Long = -1
    numbersWithIndex.foreach{ case(n, index) =>
        if(n > secondMax && index != currentMaxIndex)
          secondMax = n
    }
    currentMax * secondMax
  }

  def getMaxPairwiseProduct2(numbers: Array[Long]): Long = {
    var currentMax: Long = -1
    var currentMaxIndex: Long = -1

    for(i <- 0 to numbers.length){
      if(numbers(i) > currentMax){
        currentMax = numbers(i)
        currentMaxIndex = i
      }
    }

    var secondGreatest: Long = -1
    for(i <- 0 to numbers.length){
      if(numbers(i) > secondGreatest && i != currentMaxIndex){
        secondGreatest = numbers(i)
      }
    }

    secondGreatest * currentMax
  }


    // Java shit that intelliJ wrote
  def main(args: Array[String]) {
    val scanner: MaxPairwiseProduct.FastScanner = new MaxPairwiseProduct.FastScanner(System.in)
    val n: Int = scanner.nextInt
    val numbers: Array[Int] = new Array[Int](n)
    {
      var i: Int = 0
      while (i < n) {
          numbers(i) = scanner.nextInt
          i += 1
          i - 1
      }
    }
    System.out.println(getMaxPairwiseProduct1(numbers))
  }

  class FastScanner {
    var br: BufferedReader = null
    var st: StringTokenizer = null

    def this(stream: InputStream) {
      this()
      try {
        br = new BufferedReader(new InputStreamReader(stream))
      }
      catch {
        case e: Exception => {
          e.printStackTrace
        }
      }
    }

    def next: String = {
      while (st == null || !st.hasMoreTokens) {
        try {
          st = new StringTokenizer(br.readLine)
        }
        catch {
          case e: IOException => {
            e.printStackTrace
          }
        }
      }
      return st.nextToken
    }

    def nextInt: Int = {
      return next.toInt
    }
  }

}