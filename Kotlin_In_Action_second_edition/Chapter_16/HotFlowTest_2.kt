import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
fun main(){
  runBlocking{
    
    println("==== Hot Flow : Like live Radio ======")
    println("Radio is broadcating even if no one listens")
    
    val radioFlow = MutableSharedFlow<String>()
    
    launch{
      val songs = listOf("Song A","Song B","Song C","Song D","Song E")
      for(song in songs){
        delay(300.milliseconds)
        println("[RADIO TOWER] Now playing : $song")
        radioFlow.emit(song)
      }
    }
    
    delay(400.milliseconds)
    println("[LISTENER] just turned in now .....")
    
    var count = 0
    radioFlow.collect{ song ->
    println("[LISTENER] Heard : $song")
    count++
      if(count == 2) return@collect
    }
  }
}