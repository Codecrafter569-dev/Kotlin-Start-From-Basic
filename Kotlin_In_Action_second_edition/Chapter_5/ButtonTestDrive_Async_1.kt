class Button {
  private var clickListener : (() -> Unit)? = null
  
  fun onClick(listener : () -> Unit){
    clickListener = listener
  }
  
  fun simulateClick(){
    clickListener?.invoke()
  }
}
fun tryToCountButtonClicks(button: Button) : Int {
  var clicks = 0
  button.onClick { clicks++ }
  
  return clicks
}
fun main(){
  val button = Button()
  val result = tryToCountButtonClicks(button)
  println("Click reported immdietely : $result")
  
  button.simulateClick()
  button.simulateClick()
  println("Clicks reported after simulation : $result")
  
  var correctClicks = 0
  val button2 = Button()
  
  button2.onClick { correctClicks++ }
  button2.simulateClick()
  button2.simulateClick()
  
  println(" Correct click count : $correctClicks")
}