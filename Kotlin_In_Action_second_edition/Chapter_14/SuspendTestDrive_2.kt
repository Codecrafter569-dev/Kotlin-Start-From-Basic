import kotlinx.coroutines.*
data class Credentials(val user : String)
data class UserID(val id : String)
data class UserData(val name : String)

suspend fun login(credentials : Credentials): UserID {
  delay(500)
  return UserID("ID_0001")
}
suspend fun loadUserData(userId : UserID) : UserData{
  delay(500)
  return UserData("Vikash")
}
fun showData(data : UserData){
  println("Showing : ${data.name}")
}
fun showId(idData : UserID){
  println("Showing user : $idData")
}
suspend fun showUserInfo(credentials : Credentials){
  val userId = login(credentials)
  
  val userData = loadUserData(userId)
  
  showData(userData)
  showId(userId)
}
fun main() = runBlocking{
  showUserInfo(Credentials("vikash@gmail.com"))
}