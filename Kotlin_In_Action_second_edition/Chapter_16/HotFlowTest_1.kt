import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

fun main(){ 
runBlocking{
  
  
  val coldFlow = flow{
    println("Cold : Starting emission .....")
    emit(1)
    emit(2)
    emit(3)
    emit(4)
  }
  
  println("==== Cold Flow =====")
  println("Before collect -- nothing happens yet ....")
  coldFlow.collect{ println("Cold received : $it")}
  
  val hotFlow = MutableSharedFlow<Int>()
  
  launch{
    hotFlow.emit(10)
    hotFlow.emit(20)
    hotFlow.emit(30)
    hotFlow.emit(40)
    hotFlow.emit(60)
  }
 // delay(100.milliseconds)
  println("\n ===== Hot Flow =====")
  println("Emission may already be happing!!!")
  hotFlow.collect{ println("Hot recevied : $it")}
}

}