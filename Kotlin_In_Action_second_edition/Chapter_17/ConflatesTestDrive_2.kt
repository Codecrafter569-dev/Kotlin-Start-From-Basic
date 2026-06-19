import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main(): Unit = runBlocking{
  val fastProducer = flow{
    repeat(10){ i ->
    delay(100)
    println("Producing : $i")
    emit(i)
    }
  }
  
  fastProducer.conflate().collect{ values ->
  delay(500)
  println("collected : $values")
  
  }
}