import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
enum class Direction{LEFT,RIGHT}

class DirectionSelector{
  private val _direction = MutableStateFlow(Direction.LEFT)
  val direction = _direction.asStateFlow()
  
  fun turn(d : Direction){
    _direction.update{ d}
  }
}
fun main(){
runBlocking{
  val switch = DirectionSelector()
  
  launch{
    switch.direction.collect{
      println("[UI] Direction changed to $it")
    }
  }
  
  
  delay(200.milliseconds)
  println("----- Turning RIGHT -------")
  switch.turn(Direction.RIGHT)
  
  delay(200.milliseconds)
  println("----- Turning LEFT -------")
  switch.turn(Direction.LEFT)
  
  delay(200.milliseconds)
   println("----- Turning LEFT again -----")
   switch.turn(Direction.LEFT)
 
 delay(200.milliseconds)
  println("----- Turning RIGHT -------")
  switch.turn(Direction.RIGHT)  
   
   
   delay(200.milliseconds)
    cancel()
}

}