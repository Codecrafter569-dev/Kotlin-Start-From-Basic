interface State
interface View{
  fun getCurrentState(): State
  fun restoreState(state: State)
}
class Button: View{
  override fun getCurrentState(): State = ButtonSate()
  override fun restoreState(state: State){
    println("State restored...")
  }
}
class ButtonSate : State
fun main(){
  val b1 = Button()
  val state = b1.getCurrentState()
  b1.restoreState(state)
}