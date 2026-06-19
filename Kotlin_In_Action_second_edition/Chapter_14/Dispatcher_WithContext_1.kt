import kotlinx.coroutines.*
suspend fun loadDataFromNetwork(): String{
  return withContext(Dispatchers.IO){
    println("Network call on : ${Thread.currentThread().name}")
    Thread.sleep(500)
    "Data fetched !!"
  }
}

suspend fun processData(data : String): String{
  return withContext(Dispatchers.Default){
    println("Processing on : ${Thread.currentThread().name}")
    data.uppercase() + " PROCESSED"
  }
}
fun main(){
  runBlocking{
    println("Main On : ${Thread.currentThread().name}")
    
    val rawData = loadDataFromNetwork()
    val process = processData(rawData)
    
    println("Final result on ${Thread.currentThread().name}  : $process")
  }
}