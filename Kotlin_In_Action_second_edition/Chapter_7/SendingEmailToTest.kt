fun sendEmailTo(email:String){
  println("Sending email to $email")
}

fun main(){
  val recipient: String? = null
      // ❌ WRONG — let without ?. passes null INTO the block
    // recipient.let { sendEmailTo(it) }
    // ERROR: Type mismatch — it is still String?, not String
    
    recipient?.let{ sendEmailTo(it) }
    
    
    val validEmail: String? = "vikash@kotlin.dev"
    validEmail?.let{ sendEmailTo(it) }
    val b2 : String = "codecrafter@gmail.com"
    b2.let{ sendEmailTo(it) }
}