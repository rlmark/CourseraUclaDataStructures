import java.util.Scanner

object APlusB {
  def main( args:Array[String] ):Unit = {
    val s = new Scanner(System.in)
    val a: Int = s.nextInt()
    val b: Int = s.nextInt()
    System.out.println(a + b)
  }
}