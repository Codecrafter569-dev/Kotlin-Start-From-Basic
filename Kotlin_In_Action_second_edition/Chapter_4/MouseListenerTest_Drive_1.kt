interface MouseListener {
  fun onEnter()
  fun onClick()
}
class Button(private val listener: MouseListener){
  fun click(){
    listener.onClick()
  }
}
fun main(){
  var clickCount =0
  val button = Button(object : MouseListener{
    override fun onEnter(){
      println("Mouse entered")
    }
    override fun onClick(){
      clickCount++;
      println("Cicked $clickCount times ")
    }
  })
  button.click()
  button.click()
  button.click()
}