data class User(val id: Int,var email: String)

fun updataEmail(user: User, newEmail:String): User = user.apply{
  this.email = newEmail
}.also{ println("Updating email for user with ID: ${it.id}") }
fun main() {
    val user = User(1, "old_email@example.com")
    val updatedUser = updataEmail(user,"new_email@example.com")
    
    println("Updated User:  $updatedUser")
}