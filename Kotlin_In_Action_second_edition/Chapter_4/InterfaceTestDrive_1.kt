interface Clickable{
  fun click()
}
class Button: Clickable{
  override fun click() = println("I Was clicked ..")
}
fun main(){
  val b1 = Button()
   for( i in 1..20){
     b1.click()
   }
}