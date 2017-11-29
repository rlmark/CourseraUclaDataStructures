import java.util.Scanner

object FibonacciHuge {

  def getFibHugeNaive(n: Long, mod: Long): Long = {
    if(n <= 1){ return 0L }
    var previous = 0L
    var current = 1L
    var i = 1L
    while(i < n){
      val current_temp = previous
      previous = current
      current = previous + current_temp

      i += 1
    }
    current % mod
  }

  def calcFib(n: Long): Long = {
    def loop(l: Long, r: Long, levelTracker: Int): Long = {
      if (levelTracker >= n) {
        r
      }
      else loop(r, l + r, levelTracker + 1)
    }

    if (n == 0) 0
    else {
      loop(0, 1, 1)
    }
  }

  def findPeriodNaive(mod: Long): Int = {
    var i = 2 // because period starts with 0 1
    var notFound = true

    while(notFound) {
      val currentLast = calcFib(i) % mod
      val secondLast = calcFib(i - 1) % mod

        if(secondLast == 0 && currentLast == 1){
          notFound = false
        }

      i += 1
    }

  i - 2
  }

  // can find the period by using only remainders
//  def findPeriod2(mod: Long): Int = {
//    var i = 2 // because period starts with 0 1
//    var notFound = true
//
//  }

  def getFibHuge(n: Long, mod: Long): Long = {
    // Find the period of the modulo level
    val period = findPeriodNaive(mod)

    // Take n and mod by the length of the period
    val remainder = n % period

    // Take the remainder of that and mod by original m
    remainder % mod
  }

  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)
    val a = s.nextLong
    val b = s.nextLong
    println(getFibHugeNaive(a, b))
  }
}
