class User private constructor(val nickname: String){
  companion object {
    fun newSubscribingUser(email:String): User {
      return User(email.substringBefore("@"))
    }
  
  fun newSocialUser(accountId: Int): User{
    return User(getNameFromSocialNetwork(accountId))
  }
  private fun getNameFromSocialNetwork(accountId: Int): String {
    return when(accountId){
      1 -> "facebook_user"
      2 -> "google_user"
      3 -> "github_user"
      else  -> "unknown_user"
      }
    }
  }
}

fun main(){
  val sub1 = User.newSubscribingUser("bobkumari@gmail.com")
  val sub2 = User.newSocialUser(3)
  
  
  println(sub1.nickname)
  println(sub2.nickname)
}