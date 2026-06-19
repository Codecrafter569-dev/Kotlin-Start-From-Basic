class User{
  val nickname: String
  
  constructor(email : String){
    nickname = email.substringBefore("@")
  }
  
  constructor(socalAccountId: Int){
    nickname = when (socalAccountId){
      1  -> "Face book user"
      2  -> "goole_User"
      3  -> "Twitter_User"
      else -> "Guest_user"
    }
  }
}
fun main(){
  val g1 = User("vikash@gmail.com")
  val g2 = User(45)
  
  println(g1.nickname)
  println(g2.nickname)
}