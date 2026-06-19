class User(
val nickname: String,
val isSubscribed: Boolean = true
)
fun main(){
  val alice = User("Alice")
  println(alice.isSubscribed)
  
  
  val bob = User("Bob",false)
  println(bob.isSubscribed)
  
  val n1 = User("Asis Kumar",true)
  println(n1.isSubscribed)
  
  val v3 = User(nickname="Hello",isSubscribed = false)
  println(v3.nickname)
  println(v3.isSubscribed)
}