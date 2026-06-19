@JvmInline
value class Email(val address: String)
fun sendEmail(email: Email){
  println("Sending email to ${email.address}")
}
fun main() {
    val myEmail = Email("example@exampke.com")
    sendEmail(myEmail)
}