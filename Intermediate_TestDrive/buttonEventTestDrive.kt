class Button {
  fun onEvent(action: ButtonEvent.() -> Unit){
    val event = ButtonEvent( isRigthclick = false , amount =2 , position = Position(100,200))
    event.action()
  }
}
data class ButtonEvent(
  val isRigthclick: Boolean,
  val amount: Int,
  val position: Position
)
data class Position(
  val x:Int,
  val y: Int
)
fun main() {
    val button = Button()
    
    button.onEvent {
      if (!isRigthclick && amount == 2) {
          println("Double click!")
      }
    }
}