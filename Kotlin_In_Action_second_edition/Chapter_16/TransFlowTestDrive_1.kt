import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
fun transFlow(): Flow<Int> = flow{
  
  println("Step 1 : Producer about to emit 100")
  emit(100)
  println("Step 3 : Producer resumed , about to emit 200")
  emit(200)
  println("Step 5 : Producer resumed again , all done...")
  
}
fun main(){
  runBlocking{
    transFlow().collect{ values ->
    println("Step 2 : collector received $values processing....")
    delay(300.milliseconds)
    println("Step 4 : collector done with $values")
    }
  }
}