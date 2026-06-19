import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.random.*
import kotlin.time.Duration.Companion.milliseconds

// Models a radio numbers station
class RadioStation {
    // Private — only this class can emit
    private val _messageFlow = MutableSharedFlow<Int>()

    // Public — others can only collect
    val messageFlow = _messageFlow.asSharedFlow()

    fun beginBroadcasting(scope: CoroutineScope) {
  //  var count = 0
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                val number = Random.nextInt(0..10)
                println("[STATION] Emitting $number!")
                _messageFlow.emit(number)
            }
        }
    }
}

fun main(){ 
runBlocking {
    val station = RadioStation()
    station.beginBroadcasting(this) // Start broadcasting

    delay(600.milliseconds) // Wait a bit, miss first emission

    // Now subscribe as a listener
    station.messageFlow.collect {
        println("[LISTENER] Received: $it")
    }
    }
}
