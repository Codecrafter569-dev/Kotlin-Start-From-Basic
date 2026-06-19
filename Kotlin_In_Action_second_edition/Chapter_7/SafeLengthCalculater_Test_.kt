fun String?.safeLength(): Int = this?.length ?: 0
fun String?.safeUppercase(): String = this?.uppercase() ?: "(null)"
fun main(){
  val name: String? = "Kotlin"
  val empty: String? = null
  
  println(name.safeLength())
  println(empty.safeLength())
  println(name.safeUppercase())
  println(empty.safeUppercase())
}