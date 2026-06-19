fun parseGrade(input: String?) : String {
  val score : Int = input?.toIntOrNull() ?: return "Invalid input"
  
 return when{
    score >= 95  -> "A+"
    score >= 75  -> "A"
    score >= 65  -> "B"
    score >= 39 ->  "C"
    else     -> "F"
    
  }
}
fun main(){
  println(parseGrade("90"))
  println(parseGrade("70"))
  println(parseGrade("60"))
  println(parseGrade("44"))
  println(parseGrade("40"))
  
  println(parseGrade("JEJE"))
  println(parseGrade(null))
}