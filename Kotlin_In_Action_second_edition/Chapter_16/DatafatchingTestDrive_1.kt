import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

fun fetchUserData(userId:Int): Flow<String> = flow{
  println("Starting DB query for user $userId")
  delay(100)
  emit("Name : User $userId")
  emit("Email : User $userId@example.com")
  emit("Score : ${userId*10}")
}

fun main(): Unit = runBlocking{
  val datas = fetchUserData(30)
  
  println("==== Collector  A ====")
  datas.collect{ println(it)}
  
  println("===== Collector B =====")
  datas.collect{ println(it)}
}