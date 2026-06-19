fun main(){
  val userTages = emptyList<String>()
  
  val displayTages = userTages.ifEmpty{ listOf("general","untagged")}.map{"$it"}.joinToString(" ")
  
  println(displayTages)
  
}