fun sendEmailTo(email: String) = println("Email sent to : $email")
fun main(){
  val emails: List<String?> = listOf("alice@example.com",null,"bob@example.com",null,"carol@example.com")
  
  emails.forEach{ email -> email?.let{ sendEmailTo(it) }
  }
}