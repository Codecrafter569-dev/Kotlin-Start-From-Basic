import kotlinx.coroutines.*
fun loginAsync(credentials: String,callBack : (String) -> Unit){
  Thread{ Thread.sleep(300); callBack("UserId_001")}.start()
  
}
fun loadUserDataAsync(userId : String,callback : (String) -> Unit){
  Thread{Thread.sleep(300); callback("Vikash")}.start()
}
fun showData(data : String) = println("Showing : $data")


fun showUserInfoCallback(credentials : String){
  loginAsync(credentials){ userId -> loadUserDataAsync(userId){ userData -> showData(userData)}}
}

suspend fun loginSuspend(credentials : String): String{
  delay(300); return "UserID_0001"
}
suspend fun loadUserDataSuspend(userId : String): String{
  delay(300); return "Vikash"
}
suspend fun showUserInfoCorountie(credentials : String){
  val userId = loginSuspend(credentials)
  val userData = loadUserDataSuspend(userId)
  showData(userData)
}
fun main() = runBlocking{
  println("===== coroutines Versions ====")
  showUserInfoCorountie("user@gmail.com")
  showUserInfoCallback("userVikash@gmail.com")
}