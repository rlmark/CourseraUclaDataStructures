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

  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)
    val a = s.nextLong
    val b = s.nextLong
    println(getFibHugeNaive(a, b))
  }
}
