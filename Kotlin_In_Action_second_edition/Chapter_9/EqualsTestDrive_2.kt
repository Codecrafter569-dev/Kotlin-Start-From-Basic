class Point(val x:Int,val y:Int){
  override fun equals(other:Any?): Boolean{
    if(other === this) return true
    if(other !is Point) return false
      return other.x == x && other.y == y
  }
  override fun hashCode() = 31*x+y
  
}
fun main(){
  println(Point(10,20) == Point(10,20))
  println(Point(10,20) != Point(5,5))
  println(null == Point(1,2))
  
  println(Point(10,20) === Point(10,20))
}