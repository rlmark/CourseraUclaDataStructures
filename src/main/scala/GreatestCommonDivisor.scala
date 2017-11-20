import java.util._

object GreatestCommonDivisor {
  def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else {
      val mod = a % b
      gcd(b, mod)
    }
  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    System.out.println(gcd(a, b))
  }
}


