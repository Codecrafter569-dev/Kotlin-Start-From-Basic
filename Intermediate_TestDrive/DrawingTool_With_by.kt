interface DrawingTool {
  val color: String
  fun draw(shape: String)
  fun erase(area: String)
  fun getToolInfo(): String
}

class PenTool: DrawingTool {
  override val color: String = "Black"
  
  override fun draw(shape: String){
    println("We are using a tool for a drawing a $shape")
  }
  override fun erase(area: String){
    println("please drawing  in $area")
  }
 override fun getToolInfo(): String{
    return "The PenTool color is $color"
  }
}

class CavesSession(tool: DrawingTool): DrawingTool by tool{
  override val color: String = "Blue"
}
fun main() {
    val pen = PenTool()
    val session = CavesSession(pen)
    
    pen.draw("Circle")
    pen.erase("top-left corner")
    println(pen.getToolInfo())
    
    session.draw("Square")
    session.erase("top-right corner")
    println(session.getToolInfo())
    
}