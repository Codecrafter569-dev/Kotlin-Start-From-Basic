class Button {
  fun setOnClickListener(listener: () -> Unit){
    listener()
  }
}

fun main(){
  val button  = Button()
  
  button.setOnClickListener{
    println("I Was clicked !!")
  }
}