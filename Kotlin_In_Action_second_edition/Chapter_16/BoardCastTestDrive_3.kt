import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

class Boardcast{
  private val _messages = MutableSharedFlow<String>()
  val messages = _messages.asSharedFlow()
  
  
  fun beginBroadcasting(scope : CoroutineScope){
    scope.launch{
      _messages.emit("Hello")
      _messages.emit("Bolo")
      _messages.emit("Kaya kar raha hai...")
    }
  }
}
fun main() : Unit = runBlocking{
  val broadcaster = Boardcast()
  broadcaster.beginBroadcasting(this)
  println("Client was joined ...")
  delay(200.milliseconds)
    broadcaster.messages.collect{
      println("Message : $it")
    }
  println("All Message was missed from broadcaster .....")
  
  cancel()
}