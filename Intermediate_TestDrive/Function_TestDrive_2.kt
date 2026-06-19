
fun main() {
    data class User(val name: String? , val age: Int?)
    val users = listOf(User(null,45),User("Alice",null),User("Bob",50))
    
    val firstNonNullName = users.firstNotNullOfOrNull{ it.name}
    println("First not null Name :$firstNonNullName")
}