enum class Color{
  BLACK, GREEN,RED,YELLOW,BLUE,WHITE,ORANGE
}
fun mix(c1: Color,c2: Color): String{
  return when(setOf(c1,c2)){
    setOf(Color.RED,Color.YELLOW)  -> "ORANGE"
    setOf(Color.BLUE,Color.BLACK)   -> "Dark Blue"
    setOf(Color.WHITE,Color.BLUE) -> "Sky Blue"
    else -> "Other mixed Color"
  }
}
fun main() {
    println(mix(Color.RED,Color.YELLOW))
    println(mix(Color.BLUE,Color.BLACK))
}