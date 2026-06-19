import kotlinx.coroutines.flow.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds


fun main(): Unit = runBlocking{
  val userTyping = flow{
    emit("K")
    delay(100.milliseconds)
    emit("Ko")
    delay(80.milliseconds)
    emit("kot")
    delay(600.milliseconds)
    emit("Kotl")
    delay(90.milliseconds)
    emit("kotlin")
  }
  println("Without debounce: all keystrokes would trigger search")
  
  userTyping.collect{ name ->
  
  println("searching was tested ... : $name")
  }
  
  println("With debounce: only stable queries trigger search\n")


userTyping.debounce(250.milliseconds).collect{queriy ->
println("searching for : $queriy")
}
  

  
}