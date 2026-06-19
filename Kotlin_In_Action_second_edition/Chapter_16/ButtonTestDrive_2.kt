import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

class Button{
  private val _clicks = MutableSharedFlow<String>()
  val clicks = _clicks.asSharedFlow()
  
  suspend fun click(label : String){
    println("Button $label was clicked ...")
    _clicks.emit(label)
  }
}
fun main(): Unit  = runBlocking{
  val button = Button()
  val job   = launch{
  button.clicks.collect{ 
  clickedLabel ->
    println("Recevied click Event : $clickedLabel")
  }
}

delay(100)

button.click("Submit")
button.click("Cancel")
delay(100)
job.cancel()

}