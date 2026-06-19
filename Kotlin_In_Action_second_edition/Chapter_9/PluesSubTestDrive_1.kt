data class Point(val x:Int,val y:Int)
operator fun Point.times(scale: Double): Point = 
Point((x* scale).toInt(),(y*scale).toInt())
operator fun Char.times(count:Int): String = 
toString().repeat(count)
fun main(){
  val p1 = Point(20,30)
  println(p1*2.0)
  println(p1*39.8)
  println('V'*20 )
  println('a'*10)
}