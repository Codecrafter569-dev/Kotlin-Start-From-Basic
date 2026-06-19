@JvmInline
value class Password(private val raw: String){
  val length get() = raw.length
  
  fun isStrong(): Boolean = 
       raw.length >= 8 && raw.any{ it.isUpperCase() } && raw.any{ it.isDigit()}
       
  override fun toString() = "Password(***)"
}
fun main() {
    val pwd = Password("Kotlin@123")
    println("Password : $pwd")
}