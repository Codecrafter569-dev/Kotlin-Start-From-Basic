data class Point(val x:Int,val y:Int){
  operator fun plus(other:Point) = Point(x+other.x,y+other.y)
}
fun main(){
  var point = Point(1,2)
  point += Point(3,4)
  println(point)
  
  val numbers = mutableListOf<Int>()
  numbers += 42
  numbers += 90
  println(numbers)
}