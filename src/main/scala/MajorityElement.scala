import java.util.Scanner

object MajorityElement {
  def getMajorityElement(a : Vector[Int], left: Int, right: Int): Int = {
    if (left == right) {
      return -1
    }
    if (left + 1 == right) {
      return a(left)
    }
    //write your code here
    return -1

  }

  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    var a: Vector[Int] = Vector()
    var i = 0
    while (i < n){
      a :+= scanner.nextInt()
      i += 1
    }

    if (getMajorityElement(a, 0, a.length) != -1) {
      System.out.println(1)
    } else {
      System.out.println(0)
    }

  }
}
