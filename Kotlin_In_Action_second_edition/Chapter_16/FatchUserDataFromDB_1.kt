import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
fun fetchFromDB(): Flow<String> = flow{
  println("Databases query EXECUTING......")
  emit("Alice")
  emit("Bob")
  emit("Charlie")
  emit("Vikash")
  println("Database query COMPLETE....")
}
fun main() = runBlocking{
  val usersFlow = fetchFromDB()
  println("Flow object created .. Database Not hit yet.")
  
  println("\nNow collection .....")
  usersFlow.collect{ user ->
  println("User received : $user")
  }
}