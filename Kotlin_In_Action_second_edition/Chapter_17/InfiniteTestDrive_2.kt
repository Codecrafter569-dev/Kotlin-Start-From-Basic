import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking{
  val infiniteCounter = flow{
    var i = 0
    while(true){
      emit(i)
      i++
    }
  }
  
  val result = infiniteCounter.take(10)
  result.collect{ println("Got : $it ")}
}