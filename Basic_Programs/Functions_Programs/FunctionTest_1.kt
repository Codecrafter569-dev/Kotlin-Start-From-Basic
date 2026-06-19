
fun main() {
    
    println(registerUser("john_done","vikashkumar483@gmail.com"))
    println(registerUser("Shahilekumar","shahilKumar838@gmail.com"))
    
}
fun registerUser(userName: String,userEmail: String): String{
var registerName = mutableListOf("john_done","Vikash kumar","Shahile kumar")
    
    val registerEmail = mutableListOf("vikashkumar483@gmail.com","aashiskumar@gmail.com")
    
    
  if(userName in registerName){
    return "User already takey . please choose a different userName."
  }
  if(userEmail in registerEmail){
    return "Email already registered. Please use a different email."
  }
  registerName.add(userName)
  registerEmail.add(userEmail)
  
  return "user registered successfully: $userName"
}