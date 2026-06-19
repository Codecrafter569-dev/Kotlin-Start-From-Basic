interface Clickable{
  fun click()
  fun showOff() = println("The showOff button was clicked..")
}
class Button: Clickable{
  override fun click(){
    println("Come please Babiii.")
  }
}
fun main(){
  val b1 = Button()
  b1.click()
  b1.showOff()
}