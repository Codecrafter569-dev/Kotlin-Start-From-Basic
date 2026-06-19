import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds


suspend fun generateValue() : Int{
  delay(500.milliseconds)
  return Random.nextInt(0,10)
}

suspend fun computeSum(){
  println("Sum computation was started ... ")
  
  val sum = coroutineScope{
    val a = async{ generateValue()}
    val b = async{ generateValue()}
    
    a.await() + b.await()
  }
  
  println("Sum is : $sum")
}
fun main(){
  runBlocking{
    computeSum()
  }
}