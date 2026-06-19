import kotlinx.coroutines.*

suspend fun fetchDataFromServer(): String {
  delay(1000)
  return "User : Vikash, score : 100"
}

fun updateUI(data : String){
  println("UI Updated : $data on ${Thread.currentThread().name}")
}
fun main(){
  runBlocking{
    launch(Dispatchers.Default){
      println("Step 1 : Data was fetched on background..")
      val result = fetchDataFromServer()
      
      withContext(Dispatchers.Default){
        updateUI(result)
      }
      println("Step 3 : UI updated was completed ...")
    }
    
    delay(1000)
  }
}