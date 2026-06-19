import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun infiniteTimeFlow(): Flow<String> = flow{
  var seconds = 0
  while(true){
    delay(500.milliseconds)
    seconds++
    val minutes = seconds / 60
    val secs = seconds  % 60
    emit("Timer : %02d:%02d".format(minutes,seconds))
  }
}
fun main() = runBlocking{
  infiniteTimeFlow().take(60).collect{  timeDis  ->
    println("Displaying : $timeDis")
  }
  println("Done collectiong....")
}