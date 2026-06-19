enum class Color{
  RED,GREEN,BLUE,ORANGE,YELLOW,WHITE
}
enum class Color1(
val r: Int,
val g: Int ,
val b: Int
){
  RED(22,11,0),
  GREEN(90,23,34),
  BLUE(33,88,32),
  YELLOW(22,34,83),
  WHITE(34,45,57);
  val rgb: Int = (r*256+g)*256+b
  fun printColor() = "$rgb"
}
fun main() {
    println("The Color is ${Color.RED}")
    println("The Color is ${Color.GREEN}")
    println("The Color is ${Color.BLUE}")
    
    println("The Color is Int Integer Form :${Color1.RED.printColor()}")
    println("The GREEN Color is Int Form :${Color1.GREEN.printColor()}")
    println("Color1.YELLOW = ${Color1.YELLOW.printColor()}")
    println("Color1.BLUE = ${Color1.BLUE.printColor()}")
    println("Color1.WHITE = ${Color1.WHITE.printColor()}")
    
}