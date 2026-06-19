import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun liveCircketScores(): Flow<String> = flow{
  val events = listOf(
  "Over 1 : Rohit hits a Six ! Score : 6/0",
  "Over 2 : Virat out ! Score : 6/1",
  "Over 3 : Surya hits FOUR ! Score : 10/1"
  )
  for(event in events){
    delay(800.milliseconds)
    emit(event)
  }
}
fun main() = runBlocking{
  println("Live Match Started.....")
  liveCircketScores().collect{ update -> 
  println("Live : $update")
  }
  println("==== MATCH OVER =====")
}