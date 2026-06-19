abstract class Animated{
  abstract val animationSpeed : Double
  val keyFrame: Int = 20
  val frameFps: Int = 60
  abstract fun animation()
  open fun stopAnimating(){
    println("Stopped")
  }
  fun animateTwice(){
    animation()
    animation()
  }
}
class Spinner: Animated(){
  override val animationSpeed = 2.9
  override fun animation(){
    println("Animating at $animationSpeed")
  }
}
fun main(){
  val s1 = Spinner()
  s1.animation()
  s1.animateTwice()
}