enum class Color(
val r: Int,
val g: Int,
val b: Int
){
  RED(11,2,0),
  GREEN(23,34,44),
  BLUE(78,23,47),
  ORANGE(1,2,3),
  YELLOW(3,5,9),
  WHITE(21,23,90);
  val rgb: Int = (r*256+g)*256+b;
  fun printColor() = println("RGB : $rgb")
}
fun main() {
    println(Color.RED.r)
    println(Color.RED.g)
    println(Color.RED.b)
    Color.RED.printColor()
    println(getWarmthFromSensor())
    
}
fun mesureColora() = Color.ORANGE
fun getWarmthFromSensor(): String{
  val color = mesureColora()
  val c : String = when(color){
    Color.RED,Color.ORANGE, Color.YELLOW  -> "warm (red = ${color.r})"
    Color.GREEN  -> "neutral (Green = ${color.g}"
    Color.BLUE, Color.WHITE   -> "cold (blue = ${color.b}"
  }
  return c;
}
