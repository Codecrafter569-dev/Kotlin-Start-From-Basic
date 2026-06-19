import kotlinx.coroutines.*

class MySimulatedViewModel{
  private val viewModelScope = CoroutineScope(Dispatchers.Default + SupervisorJob())
  
  fun startWork(){
    viewModelScope.launch{
      while(true){
        println("viewModelScope : Tick !! (Working ...)")
        delay(300)
      }
    }
  }
  
  fun onCleared(){
    println("viewModel destroy - scope cancel ho raha hai !!")
    viewModelScope.cancel()
  }
}
fun main(){
  runBlocking{
    val viewModel = MySimulatedViewModel()
    viewModel.startWork()
    
    delay(1000)
    println("User screen se bahar gaya !!")
    viewModel.onCleared()
    
    delay(500)
    println("Koi new tick nahi aya cancle hogaya hai")
    
  }
}