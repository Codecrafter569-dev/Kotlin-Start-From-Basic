fun String?.isNullOrBlank(): Boolean = this == null || this.isBlank()
fun main(){
  val a: String? = null
  val b: String = " "
  val c: String = "Hello"
  
  println(a.isNullOrBlank())
  println(b.isNullOrBlank())
  println(c.isNullOrBlank())
}