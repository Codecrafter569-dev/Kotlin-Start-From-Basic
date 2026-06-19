open class Shape{
  open fun draw(){
    println("Drawing a shape")
  }
}
class Circle: Shape(){
  override fun draw(){
    println("Drawing circle")
  }
}
fun main() {
    val s: Shape = Circle()
    val s1: Circle = Circle()
    val s3: Shape = Shape()
    s3.draw()
    s1.draw()
    s.draw()
}