class Point(val x:Int,val y:Int){
  operator fun component1() = x+30
  operator fun component2() = y*29
}
fun main(){
  val(x,y) = Point(30,40)
  println("x+30 = $x")
  println("Y*29 = $y")
}