import java.util._

object LowestCommonMultiple {
  def lcm_naive(a: Int, b: Int): Int = {
    for(l <- 1 to a * b) {
      if (l % a == 0 && l % b == 0)
        return l
    }

    return a * b
  }

  def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else {
      val mod = a % b
      gcd(b, mod)
    }
  }

  def lcm(a: Int, b: Int): Long = {
    val aLong = a.toLong
    val bLong = b.toLong
    val highestCommonMult: Long = aLong * bLong
    val g = gcd(a, b)
    highestCommonMult/g
  }

  def main(args: Array[String]): Unit = {
    val s = new Scanner(System.in)
    val a = s.nextInt()
    val b = s.nextInt()

    println(lcm(a,b))
  }

}
