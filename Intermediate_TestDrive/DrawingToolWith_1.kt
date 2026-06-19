interface DrawingTool {
    val color: String
    fun draw(shape: String)
    fun erase(area: String)
    fun getToolInfo(): String
}
class PenTool: DrawingTool {
  override val color: String = "black"
  
  override fun draw(shape: String){
    println("Drawing $shape using a pen in $color")
  }
  override fun erase(area: String){
    println("Erasing $area with pen tool")
  }
  override fun getToolInfo(): String{
    return "PenTool :(color = $color)"
  }
}
class CanvasSession(val tool: DrawingTool) : DrawingTool {
  override val color: String = "Blue"
  override fun draw(shape: String){
    tool.draw(shape)
  }
  override fun erase(area: String){
    tool.erase(area)
  }
  override fun getToolInfo(): String {
    return tool.getToolInfo()
  }
}
fun main() {
    val pen = PenTool()
    val session = CanvasSession(pen)
    
    println("Pen color: ${pen.color}")
    println("session color: ${session.color}")
    session.draw("Circle")
    session.erase("top-left corner")
    
    println(session.getToolInfo())
}