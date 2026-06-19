fun main(){
  val withResult : String = with(StringBuilder()){
    append("Hello how i can help you please...")
    toString()
  }
  println(withResult)
  
  
  val appResult: String = StringBuilder().apply{
    append("This is main goal to get more power ok byyy bro")
    append("My gril friend now i was gooo.. ")
  }.toString()
  
  println(appResult)
}