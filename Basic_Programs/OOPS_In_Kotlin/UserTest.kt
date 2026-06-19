data class User(var name: String,val id:Int)

fun main() {
    val user = User("Alex",1)
    val userSecond = User("Alex",1)
    val thirdUser = User("Max",45)
    println(user)
    println("user == userSecond: ${user == userSecond}")
    println("user == thirdUser: ${user == thirdUser}")
    
    
}