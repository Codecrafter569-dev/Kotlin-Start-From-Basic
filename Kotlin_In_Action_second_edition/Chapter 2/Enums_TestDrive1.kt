enum class Color{
  RED,GREEN,BLUE,YELLOW,WHITE,INDIGO
}
fun mix(c1: Color,c2: Color): String{
  return when{
    (c1 == Color.RED && c2 == Color.YELLOW) ||
    (c1 == Color.YELLOW && c2 == Color.RED)   ->
    "Orange color"
    
    (c1 == Color.YELLOW && c2 == Color.BLUE) ||
    (c1 == Color.BLUE && c2 == Color.YELLOW)  ->
    "Green Color"
    
    (c1 == Color.BLUE && c2 == Color.WHITE) ||
    (c1 == Color.WHITE && c2 == Color.BLUE)  ->
    "Indigo color"
    
    else -> "Drtiy Color"
  }
}
fun main() {
    println(mix(Color.RED,Color.YELLOW))
    println(mix(Color.YELLOW,Color.RED))
    println(mix(Color.YELLOW,Color.BLUE))
    println(mix(Color.BLUE,Color.WHITE))
}