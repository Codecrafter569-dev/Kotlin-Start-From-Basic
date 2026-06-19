data class Subscription(val name: String,val isActive : Boolean)
fun getActiveSubscription(sus: List<Subscription>): Subscription? {
  return sus.singleOrNull{su -> su.isActive }
}
fun main() {
    val user1 = listOf( Subscription("Basic Plan",false),Subscription("Premium Plan",true))
    
    val user2 = listOf(Subscription("Basic Plan",true), Subscription("Premium Plan",true))
    
    
    println(getActiveSubscription(user1))
    println(getActiveSubscription(user2))
}