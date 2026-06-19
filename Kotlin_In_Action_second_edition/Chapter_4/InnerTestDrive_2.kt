class Outer{
  inner class Inner{
    fun getOuter(): Outer = this@Outer
  }
}
fun main(){
  val outer = Outer()
  val inner = outer.Inner()
  println(inner.getOuter())
}