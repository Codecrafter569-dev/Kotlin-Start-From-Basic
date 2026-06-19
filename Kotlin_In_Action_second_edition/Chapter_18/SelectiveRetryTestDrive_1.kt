import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
class NetworkTimeoutException : Exception("Network Time out Exception ")
class AuthorizationException : Exception(" Invalid token ! Don't retry auth error")

var networkAttemptsCount = 0
val apiFlow = flow{
  networkAttemptsCount++
  println("ApI call attempt $networkAttemptsCount")
  
  when(networkAttemptsCount){
     1 -> throw NetworkTimeoutException()
     2 -> throw NetworkTimeoutException()
     3 -> {
       emit("User : Alice")
       emit("User : Bob")
     }
  }
  
}
fun main():Unit = runBlocking{
  try {
    apiFlow.retry(5){ cause ->
    when(cause){
      is NetworkTimeoutException ->{
        println("Network error =--- Will retry : ${cause.message}")
        true
      }
      
      is AuthorizationException   ->{
        println("Auth error - will not retry : ${cause.message}")
        false
      }
      
      else -> false
    }
    }
    .collect{
      println("Recived : $it")
    }
  } catch (e: Exception) {
   // e.printStackTrace()
   println("Final faliner : ${e.message}")
  }
}