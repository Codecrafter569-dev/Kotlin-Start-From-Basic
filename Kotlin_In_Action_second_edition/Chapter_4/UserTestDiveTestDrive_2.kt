interface User {
  val nickname : String
}
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String): User{
  override val nickname : String 
      get() = email.substringBefore('@')
}
class SocicalUser(val accountId: Int): User{
  override val nickname = getNameFromSocialNetwork(accountId)
}
fun getNameFromSocialNetwork(accountId: Int) = "Kodeee\$accountId"
fun main(){
  println(PrivateUser("Kodeee").nickname)
  
  println(SubscribingUser("Vikash@kotlinlang.org").nickname)
  println(SocicalUser(393).nickname)
}