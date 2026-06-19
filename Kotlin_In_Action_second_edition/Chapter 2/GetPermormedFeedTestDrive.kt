enum class Color{
  RED,GREEN,BLUE,YELLOW,INDEGO,VELONENT,ORANGE
}
fun getOrange() = Color.ORANGE
fun getWarthMetals(): String{
//val c  = getOrange()
  return when(getOrange()){
    Color.ORANGE,Color.RED,  -> "Warm Color"
    Color.GREEN  -> "Green chizze please..."
    Color.YELLOW  -> "Banana please..."
    else          ->"Other Color"
  }
}
fun main() {
    println(getWarthMetals())
}