import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

fun numberStream(): Flow<Int> = flow{
  var n = 1
  while(true){
    emit(n++)
    delay(300.milliseconds)
  }
}
fun main(){
  runBlocking{
    println("Collecting numbers for 4 seconds .....")
    
    val result = withTimeoutOrNull(4.seconds){
      numberStream().collect{ number -> println("Number : $number")
      }
      "Completed normaly...."
    }
    
    if(result == null){
      println("Time out !! Collecting was cancelled automatically.....")
    }
    
  }
}