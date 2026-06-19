fun processName(name: String?){
  if(name != null){
    println("IF style : ${name.uppercase()}")
  }
  
  name?.let{
    println("LET style : ${it.uppercase()}")
  }
}
fun sendEmailTo(email:String){
  println("Sending email to $email")
}
fun main(){
  var email: String? = "vikash@kotlin.dev"
  email?.let{
    sendEmailTo(it)
  }
  
  var email1: String? = null
  email1?.let{
    sendEmailTo(it)
  }
  
  processName("Vikash")
  processName(null)
}