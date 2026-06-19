import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
class VolumeControl{
  private val _volume = MutableStateFlow(50)
  val volume = _volume.asStateFlow()
  
  fun setVolume(level : Int){
    val clamped = level.coerceIn(0,100)
    _volume.update{clamped }
  }
}
fun main(){
  runBlocking{
    val speaker = VolumeControl()
    launch{
      speaker.volume.collect{
        println("[Speaker] Volume set to: $it%")
      }
    }
    
    
    delay(100)
    println("--- Setting volume to 70 ---")
    speaker.setVolume(70)   // Changed → emits


delay(100)
    println("--- Setting volume to 70 again ---")
    speaker.setVolume(70)   // Same → NO emission

    delay(100)
    println("--- Setting volume to 150 (clamped to 100) ---")
    speaker.setVolume(150)  // Changed (clamped to 100) → emits

    delay(100)
    println("--- Setting volume to 100 again ---")
    speaker.setVolume(100)  // Same → NO emission

    delay(100)
    println("--- Setting volume to 30 ---")
    speaker.setVolume(30)   // Changed → emits

    delay(100)
    cancel()
    
    
  }
}