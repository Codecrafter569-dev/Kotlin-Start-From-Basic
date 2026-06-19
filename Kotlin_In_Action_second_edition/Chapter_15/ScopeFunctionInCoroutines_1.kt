import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun fetnchName(): String{
  return "Vikash Kumar"
}
suspend fun fetnchScore(): Int{
  return 900
}
suspend fun fetnchRank(): Int{
  return 1
}

suspend fun buildUserProfile(): String{
  return coroutineScope{
    val name = async{ fetnchName()}
    val score = async{ fetnchScore()}
    val rank = async{ fetnchRank()}
    
    "Name ${name.await()} , Score : ${score.await()} , Rank : ${rank.await()}"
  }
}
fun main(){
  runBlocking{
    val profile = buildUserProfile()
    println("The full Details : $profile")
  }
}