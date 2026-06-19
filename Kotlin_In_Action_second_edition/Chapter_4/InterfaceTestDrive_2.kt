interface Clickable{
  fun click()
  fun showOff() = println("I'm clickable!!!")
}
interface Focusable{
  fun setFocus(b: Boolean) = println("I ${if(b) "got" else "lost"} focus")
  
  fun showOff() = println("I'm Focusable!!")
}
class Button: Clickable, Focusable {
override fun click() = println("I Was clicked...")
  override fun showOff(){
    super<Clickable>.showOff()
    super<Focusable>.showOff()
  }
}
fun main(){
  val b1 = Button()
  b1.click()
  b1.showOff()
  b1.setFocus(true)
  b1.setFocus(false)
  
}