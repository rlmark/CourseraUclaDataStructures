import java.util.Scanner

object FractionalKnapsack {
  type ValueAndWeight = (Int, Int)
  def getOptimalValue(capacity: Int, values: Seq[Int], weights: Seq[Int]): Double ={
    // Take the values and weights and sort by the higest value per weight pair.
    val tuples: Seq[ValueAndWeight] = values.zip(weights)
    val sorted = tuples.sortWith(sortTuples)

    def loop(capacityLeft: Int, potentialLootLeft: Seq[(Int, Int)], currentLootValue: Double): Double = {
//      if(capacityLeft == 0) currentLootValue
//      else {
        potentialLootLeft match {
          case (v, w)::tail =>
            // if your remaining capacity is greater than the weight of loot available
            if (capacityLeft >= w) {
              val newLootValue = v + currentLootValue // add the entire value of the loot to current val
              val newRemainingCapacity = capacityLeft - w // subtract the entire weight of the loot from the current capacity
              loop(newRemainingCapacity, tail, newLootValue) // recursive call
            }
            // your remaining capacity is less than the weight you can put in your knapsack
            // so you need fractional value returned, no recursive call
            else {
              // value per weight
              val valuePerWeight: BigDecimal = BigDecimal.valueOf(v.toDouble/w)
              // shouldn't need to recurse
              // must have 4 digits of precision
              (valuePerWeight * capacityLeft + currentLootValue).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble
            }
          case Nil => currentLootValue // your knapsack is bigger than available loot
        }
      }
//    }

   loop(capacity, sorted, 0.0)
  }

  def sortTuples(t1: (ValueAndWeight), t2: (ValueAndWeight)): Boolean = {
    BigDecimal.valueOf(t1._1.toDouble / t1._2).setScale(10, BigDecimal.RoundingMode.HALF_UP) > BigDecimal.valueOf(t2._1.toDouble / t2._2).setScale(10, BigDecimal.RoundingMode.HALF_UP)
  }


  def getOptimalValue2(capacity: Int, values: Seq[Int], weights: Seq[Int]): Double ={
    for (i <- values.indices) {

    }
    ???
  }
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    val n = scanner.nextInt()
    val capacity = scanner.nextInt()
    var values = Seq[Int]()
    var weights = Seq[Int]()
    for (i <- 0 until n) {
      values :+= scanner.nextInt()
      weights :+= scanner.nextInt()
    }
    println(getOptimalValue(capacity, values, weights))
  }
}
