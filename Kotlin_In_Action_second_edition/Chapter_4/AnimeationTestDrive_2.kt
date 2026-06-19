interface Clickable{
  fun click()
}
open class RichButton: Clickable{
  fun disable(){
    println("The Button was Disable..")
  }
  open fun animation(){
    println("The Button was Prased and animation is Started")
  }
  override fun click(){
    println("RichButton was Prased...")
  }
}
class TheamButton: RichButton(){
  override fun animation(){
    println("Theam is Animated..")
  }
  override fun click(){
    println("The Theam Button was Prased..")
  }
}
fun main(){
  val b1 = TheamButton()
  b1.disable()
  b1.animation()
  b1.click()
  
  val r1 = RichButton()
  r1.disable()
  r1.animation()
  r1.click()
}