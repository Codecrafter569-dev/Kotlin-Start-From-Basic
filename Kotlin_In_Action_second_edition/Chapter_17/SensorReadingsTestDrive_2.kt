import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun sensorReadings() = flow{
  println("Sensor started....")
  var temp = 15
  repeat(10){
    temp += 3
    
    
    println("Sensor emitting :$temp")
    emit(temp)
  }
  println("Sensor finished (you won't see this if first() cancels early!)")
}
fun main(): Unit = runBlocking{
  val firstHighTemp = sensorReadings().first{ reading -> reading > 28 }
  
  println("First high temperatures : $firstHighTemp")
}