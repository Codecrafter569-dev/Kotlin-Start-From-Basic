abstract class Shape{
  abstract fun area()
}
class Circle(val radius: Double): Shape(){
  override fun area(){
    println("The area of this Circle is: ${3.14* radius*radius}")
  }
}
fun main() {
    val circle = Circle(89.3)
    circle.area()
}