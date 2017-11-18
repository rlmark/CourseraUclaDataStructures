
import java.util._

object FibonacciLastDigit {
  def getFibonacciLastDigitNaive(n: Int): Long = {
    if (n <= 1) {
      n
    }
    else {
      var previous: Long = 0
      var current: Long = 1
      for (i <- 1 to n -1) {
        val tmp_previous: Long = previous % 10
        previous = current % 10
        current = (tmp_previous + current) % 10
      }
      val mod = current % 10
      mod
    }
  }

  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)
    val n = s.nextInt
    println(getFibonacciLastDigitNaive(n))
  }

}
