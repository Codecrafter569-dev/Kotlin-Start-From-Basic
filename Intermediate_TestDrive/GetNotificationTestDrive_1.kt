data class User(val name: String?)

fun getNotifi(user: Any,emailEnabled: Boolean,smsEnabled: Boolean): List<String>{
  val validUser = user as? User ?: return emptyList()
  val userName = validUser.name ?: "Guest"
  
  return listOfNotNull(
  "Email Notification enabled for $userName".takeIf{emailEnabled},
  "Sms Notification enabled for $userName".takeIf{smsEnabled}
  )
}
fun main() {
    val user1 = User("Vikash")
    val user2 = User(null)
    val invalidUser = "NotAUser"
    
    println(getNotifi(user1,emailEnabled = true,smsEnabled = false))
    println(getNotifi(user2,emailEnabled = true,smsEnabled = true))
    println(getNotifi(invalidUser,emailEnabled = true,smsEnabled = true))
}