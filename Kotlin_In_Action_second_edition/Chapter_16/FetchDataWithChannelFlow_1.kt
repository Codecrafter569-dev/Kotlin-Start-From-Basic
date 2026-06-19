import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

suspend fun fetchData(id : Int): String{
  delay(500.milliseconds)
  return "Data-$id"
}
val brokenFlow = flow<String>{
  coroutineScope{
    repeat(5){
      id -> launch{
        val data = fetchData(id)
        emit(data)
      }
    }
  }
}
fun main(){
  runBlocking{
    try {
      brokenFlow.collect{ println(it)}
    } catch (e: IllegalStateException) {
      //e.printStackTrace()
      println("Error caught : ${e.message}")
      println("Solution : Use channelFlow instead of flow!!!....")
    }
  }
}