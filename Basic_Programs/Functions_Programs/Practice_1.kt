import kotlin.math.PI;
fun main() {
    println(circleArea(90))
    println(circleArea2(34))
}
fun circleArea(radius:Int): Double{
  return PI * radius * radius
}
fun circleArea2(radius:Int): Double = PI *radius * radius