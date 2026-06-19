fun main(){
  val rawInput: String? = " kotlin "
  val cleaned: String? = rawInput?.let{
    it.trim().uppercase()
  }
  
  println(cleaned)
  
  val noInput : String? = null
  val result = noInput?.let{
    it.trim().uppercase() 
  } ?: "No Input proveded.."
  println(result)
}