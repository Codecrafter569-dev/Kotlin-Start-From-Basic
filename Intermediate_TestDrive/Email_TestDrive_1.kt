@JvmInline
value class Email(val address: String){
  init{
    require("@" in address){" Invalid Email : $address"}
  }
}
fun main() {
    val email = Email("vikash@example.com")
    println("Email saved : ${email.address}")
}