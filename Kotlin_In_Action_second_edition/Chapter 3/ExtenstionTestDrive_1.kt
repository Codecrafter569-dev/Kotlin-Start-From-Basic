open class View
class Button: View()
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a Button!")
fun main() {
    val v1: View = Button()
    v1.showOff()
    val v2 : View =  View()
    v2.showOff()
    
    val v3: Button = Button()
    v3.showOff()
    
    //val v4 : Button = View()
  //  v4.showOff()
}