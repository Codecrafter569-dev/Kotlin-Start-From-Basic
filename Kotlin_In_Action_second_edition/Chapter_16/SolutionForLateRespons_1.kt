import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
class Broadcaster{
  private val _message = MutableStateFlow<List<String>>(emptyList())
  val messages = _message.asStateFlow()
  
  
  fun beginBroadcasting(scope : CoroutineScope){
    scope.launch{
      _message.update{ it + "Hello"}
      _message.update{ it + "Bolo Be"}
      _message.update{ it + "Haaa"}
    }
  }
}
fun main(): Unit = runBlocking{
  val broadcaster1 = Broadcaster()
  broadcaster1.beginBroadcasting(this)
  
  delay(200.milliseconds)
  
  println("I Resived all Messages :${broadcaster1.messages.value}")
}