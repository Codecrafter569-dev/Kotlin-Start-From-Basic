data class User(val username: String, val isActive : Boolean)

fun getActiveUsername(users: List<User>): List<String> = 
users.mapNotNull { user -> user.username.takeIf{ user.isActive}}
fun main() {
    val allUsers = listOf(
    User("alice123",true),
    User("bob_the_builder",false),
    User("Charli899",true))
    
    println(getActiveUsername(allUsers))
    
}