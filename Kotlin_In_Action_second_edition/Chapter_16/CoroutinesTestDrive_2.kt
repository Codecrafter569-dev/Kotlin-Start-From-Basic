import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
suspend fun fetchUserData(userId : Int): String{
  delay(500.milliseconds)
  return "UserProfile(id= $userId , name=User $userId)"
}
val concurrentUserFlow = channelFlow<String>{
  repeat(5){ id -> launch{
    val userData = fetchUserData(id)
    send(userData)
    }
  }
}
fun main(){
  runBlocking{
    println("Starting concurrent fetch (should take -500ms,not 2500ms)....")
    
    
    val startTime = System.currentTimeMillis()
    concurrentUserFlow.collect{ userProfiles ->
    println("Received: $userProfiles")
    }
    val elapsed = System.currentTimeMillis() - startTime
    
    println("Total time : ${elapsed}ms")
    println("With ragular flow it would take - 2500ms")
  }
}