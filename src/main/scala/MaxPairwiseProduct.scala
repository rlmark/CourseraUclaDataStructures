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

  // with scala types
  def getMaxPairwiseProduct2(numbers: Array[Int]): Long = {
    lazy val numbersWithIndex = numbers.zipWithIndex

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

  def getMaxPairwiseProduct3(numbers: Array[Int]): Long = {
    var currentMax: Long = -1
    var currentMaxIndex: Long = -1

    for(i <- numbers.indices){
      if(numbers(i) > currentMax){
        currentMax = numbers(i)
        currentMaxIndex = i
      }
    }

    var secondGreatest: Long = -1
    for(i <- numbers.indices){
      if(numbers(i) > secondGreatest && i != currentMaxIndex){
        secondGreatest = numbers(i)
      }
    }

    secondGreatest * currentMax
  }

  def getMaxPariwiseProduct4(numbers: scala.collection.immutable.Vector[Int]): Long = {
    var currentMax: Long = -1
    var currentMaxIndex: Long = -1

    var i = 0
    while(i < numbers.length){
      if (numbers(i) > currentMax) {
        currentMax = numbers(i)
        currentMaxIndex = i
      }
      i += 1
    }

    i = 0
    var secondGreatest: Long = -1
    while(i < numbers.length){
      if(numbers(i) > secondGreatest && i != currentMaxIndex){
        secondGreatest = numbers(i)
      }
      i += 1
    }
    secondGreatest * currentMax
  }

  def main(args: Array[String]) {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt

    var numbers: scala.collection.immutable.Vector[Int] = scala.collection.immutable.Vector()
    var i = 0
    while ( i < n) {
      val y = scanner.nextInt
      numbers :+= y
      i += 1
    }
    println(getMaxPariwiseProduct4(numbers))
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
