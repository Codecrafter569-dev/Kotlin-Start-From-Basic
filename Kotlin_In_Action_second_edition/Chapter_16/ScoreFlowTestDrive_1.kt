import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
fun scoreFlow(): Flow<Int> = flow{
  println("[Producer 1] about to emit score 10")
  emit(10)
  println("[Producer 2] About to emit score 20")
  emit(20)
  println("[Producer 3] About to emit score 30")
  emit(30)
  println("[Producer] all scores emitted ....")
}
fun main() = runBlocking{
  scoreFlow().collect { score -> 
  println("[Collector] Received score : $score")
  }
}