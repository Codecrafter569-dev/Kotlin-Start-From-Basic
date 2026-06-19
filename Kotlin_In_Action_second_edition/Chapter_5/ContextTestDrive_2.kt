class Context

class TextView(val context: Context){
  var text: String = " "
  var textSize : Double = 14.0
  private var paddingLeft = 0
  private var paddingTop = 0
  private var paddingRight = 0
  private var paddingBottom = 0
  
  
  fun setPadding(left: Int,right:Int,top:Int,bottom:Int){
    paddingLeft = left ; paddingBottom = bottom
    paddingRight = right ; paddingTop = top;
  }
  
  override fun toString() = 
  "TextView (Text= '$text' , size = '$textSize' , Top= '$paddingTop', left= '$paddingLeft', right = '$paddingRight' , bottom= '$paddingBottom'.)"
  
  
}
fun createViewWithCustomAttributes(context: Context) : TextView  = TextView(context).apply{
    text = "Sample Text"
    textSize = 20.0
    setPadding(10,0,0,0)
  }
fun main(){
  val cx1 = Context()
  val textView1 = TextView(cx1)
  val textView2 = createViewWithCustomAttributes(cx1)
  println(textView2)
}