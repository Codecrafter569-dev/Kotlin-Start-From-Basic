class Rectangle(val width: Double,val height: Double){
  val area: Double
  get() = width*height
  
  val perimeter : Double
  get() = 2 * (width + height)
}
fun main() {
    val rect = Rectangle(5.0,9.0)
    println("Area: ${rect.area}")
    println("Perameter : ${rect.perimeter}")
}