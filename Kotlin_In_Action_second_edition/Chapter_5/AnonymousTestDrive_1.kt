interface ClickListener {
    fun onClick(viewName: String)
  }
fun main(){

  
  fun attachListener(name:String,listener : ClickListener){
    listener.onClick(name)
  }
  
  attachListener("SubmitButton", object : ClickListener{
    override fun onClick(viewName: String){
      println("$viewName was clicked using anonymous object !")
    }
  })
  
}