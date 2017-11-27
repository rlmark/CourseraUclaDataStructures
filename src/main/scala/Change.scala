import java.util.Scanner

import scala.annotation.tailrec

object Change {
  def getChange(m: Int): Int = {
    val denominations = List(10,5,1)
    @tailrec
    def loop(denominationList: List[Int], currentRemainder: Int, currentCount: Int ): Int = {
      denominationList match {
        case Nil => currentCount
        case currentDenomination :: tail =>
          val newCount = currentRemainder / currentDenomination
          val newRemainder = currentRemainder % currentDenomination
          loop(tail, newRemainder, currentCount + newCount)
      }
    }

    loop(denominations, m, 0)
  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val m = scanner.nextInt()
    println(getChange(m))
  }
}
