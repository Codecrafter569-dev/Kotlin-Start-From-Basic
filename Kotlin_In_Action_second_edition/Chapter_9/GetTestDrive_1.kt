data class Point(val x:Int,val y:Int)
operator fun Point.get(index: Int): Int{
  return when(index){
    0  -> x 
    1  -> y
    else ->throw IndexOutOfBoundsException("Invalid coordinate $index")
  }
}
fun main(){
  val p1 = Point(20,10)
  val p2 = Point(30,40)
  println(p1[0])
  println(p1[1])
  println(p2[0])
  println(p2[1])
}