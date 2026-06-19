import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
var runCount = 0

fun questionFlow(): Flow<String> = flow{
  runCount++
  println("\n[Run $runCount] Producer started....")
  emit("What is kotlin ? !!!....")
  delay(300.milliseconds)
  emit("What is Flow? !...")
  delay(300.milliseconds)
  emit("what is coroutines ....")
  println("[Run $runCount Producer finished ....")
}
fun main(){
  runBlocking{
    val qFlow = questionFlow()
    
    println("===== Student 1 collecting =====")
    qFlow.collect{ que ->
    println("Student 1 answers : $que  -> ......")
    }
    
    
    println("===== Student 2 collecting =====")
    qFlow.collect{ queja ->
      println("Student 2 answers : $queja")
      
    }
    println("Total Producer numbers .... $runCount")
  }
}