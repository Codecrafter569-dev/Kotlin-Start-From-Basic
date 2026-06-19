interface MouseListener{
  fun onEnter()
  fun onClick()
}
class Button(private val listener: MouseListener){
  fun hover(){
    listener.onEnter()
  }
  fun click(){
    listener.onClick()
  }
}
fun main(){
  val button = Button(object : MouseListener{
    override fun onEnter(){
      println("Mouse entered the button")
    }
    override fun onClick(){
      println("Button clicked")
    }
  }) 
  
  button.hover()
  button.click()
}