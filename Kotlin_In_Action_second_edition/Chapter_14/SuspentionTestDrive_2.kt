import kotlinx.coroutines.*
fun blockinglogin(): String{
  Thread.sleep(1000)
  return "UserID_123"
}

suspend fun suspendLogin(): String{
  delay(1000)
  return "UserId_Name_Vikash_Kumar"
}
fun main() = runBlocking{
  println("suspend login start ...")
  val id = suspendLogin()
  println("Got :$id")
  
  val id1 = blockinglogin()
  println("Got : $id1")
}