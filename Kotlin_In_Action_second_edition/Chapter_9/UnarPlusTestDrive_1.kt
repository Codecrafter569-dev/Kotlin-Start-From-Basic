import java.math.BigDecimal
data class Point(val x:Int,val y:Int)
operator fun Point.unaryMinus()  = Point(-x,-y)
operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun  main(){
  val p = Point(10,30)
  println(-p)
  
  var bd = BigDecimal.ZERO
  println(bd++)
  println(bd)
  println(++bd)
}