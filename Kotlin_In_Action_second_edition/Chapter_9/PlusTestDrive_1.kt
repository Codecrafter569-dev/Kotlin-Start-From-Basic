data class Point(val x: Int,val y: Int){
  operator fun plus(other: Point): Point = Point(x+other.x,y+other.y)
}
operator fun Point.minus(other: Point): Point = Point(x- other.x,y - other.y)
fun main(){
  val p1 = Point(20,30)
  val p2 = Point(40,70)
  
  println(p1 - p2)
  println(p1+p2)
  // println()
}