data class User(
  val id: Int,
  val name: String,
  val friends: List<Int>
)
fun getNumberOffFriends(users: Map<Int,User>,userId: Int): Int{
//  val user = users[userId] ?: return -1
  return users[userId]?.friends?.size ?: -1
}
fun main() {
    val user1 = User(1,"Alice",listOf(2,3))
    val user2 = User(2,"Vikash",listOf(4))
    val user3 = User(3,"Bob",listOf(2))
    
    val users = mapOf(1 to user1, 2 to user2,3 to user3)
    
    println(getNumberOffFriends(users,1))
    println(getNumberOffFriends(users,2))
    println(getNumberOffFriends(users,3))
}