import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
fun temperatureReadings() = flow{
  emit(22)
  emit(25)
  emit(19)
  emit(30)
  emit(17)
  
  
}
fun main(): Unit = runBlocking{
  println("All tems : ")
  temperatureReadings().collect{ temps -> println("$temps")
  }
  
  println()
  
  
  val list = temperatureReadings().toList()
  println("As list : $list")
  
  
  val counts = temperatureReadings().count()
  println("Count : $counts")
  
  val sums = temperatureReadings().reduce{ acc , value -> acc + value}
  println("Sum : $sums")
}