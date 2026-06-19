open class View{
  open fun click() = println("View clicked")
}
class Button: View(){
  override fun click() = println("Button is clicked!")
}
fun main() {
    val view : View = View()
    view.click()
    
    val button : View = Button()
    button.click()
}