interface DrawingTool{
  val color: String
  fun draw(shape: String)
  fun erase(area: String)
  fun getToolInfo(): String
}
class PenTool: DrawingTool {
  override val color: String = "black"
  
  override fun draw(shape:String){
    println("Drawing $shape using a pen is $color")
  }
  override fun erase(area: String){
    println("Erasing $area with pen tool")
  }
  override fun getToolInfo(): String {
    return "PenTool(color = $color)"
  }
}
fun main() {
    val pen = PenTool()
    
    pen.draw("Square")
    pen.erase("900")
    println(pen.getToolInfo())
}