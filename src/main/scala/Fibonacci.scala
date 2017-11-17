import java.util.Scanner

object Fibonacci {

  def calcFiBInefficient(n: Int): Int = {
    if (n <= 1){
      n
    } else calcFiBInefficient(n - 1 ) + calcFiBInefficient(n - 2)
  }

  def calcFib(n: Int): Int = {
    def loop(l: Int, r: Int): Int = {
      if (r >= n) {
        r
      }
      else loop(r, l + r)
    }

if (n == 0) 0 else {
  loop(0, 1)
}
  }
  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)

    val n = s.nextInt
    println(calcFib(n));
  }
}
