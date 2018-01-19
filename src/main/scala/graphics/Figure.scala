package graphics

case class Color(red: Byte, green: Byte, blue: Byte)

abstract class Figure {
  // Color
  val color: Color

  // Location and size (Assuming square shape)
  val xAxis: Int
  val yAxis: Int
  val height: Int

  // Position forward or backwards in canvas
  val zAxis: Int
  // greater z values are forward in canvas

  // Overlapping
  def isOn(x: Int, y: Int):Boolean


  // Note: ask Erica, why do I need an isSelected function and a setSelected function!???
  var isSelected: Boolean
//  def isSelected(): Boolean

  // Note: Think about maybe returning something here
  def setSelected(boolean: Boolean): Unit
}

// The fields of the case class are critical for rendering, the methods are for interacting with the object
case class Circle(color: Color, xAxis: Int, yAxis: Int, zAxis: Int, height: Int) extends Figure {

  // The point is inside the circle if its distance from the center of the circle is at most the radius of the circle
  override def isOn(x: Int, y: Int): Boolean = {
    val radius = height.toFloat / 2
    val (xCenter,yCenter) = (x + radius, y + radius)
    val (xDiff, yDiff) = (xCenter - x, yCenter - y)

    val distanceXYFromCenter = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2))

    distanceXYFromCenter <= radius
  }

  // isSelected is set as true at time of class creation?
  override var isSelected: Boolean = true

  override def setSelected(boolean: Boolean): Unit = {
    if (!isSelected) isSelected = true
  }
}