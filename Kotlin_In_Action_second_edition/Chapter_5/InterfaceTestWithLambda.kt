interface OnClickListener{
  fun onClick()
}
class Button {
  fun setOnClickListener(listener : OnClickListener){
    listener.onClick()
  }
}

fun main(){
  val button = Button()
  
  button.setOnClickListener(object : OnClickListener{
    override fun onClick(){
      println("I was Clicked !!")
    }
  })
  
}