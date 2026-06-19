class Validator{
  val isValidAge : (Int) -> Boolean = { n -> n in 0..120}
  
  val isValidName : (String) -> Boolean = { str -> str.isNotBlank() && str.length >= 2 }
}
fun main(){
  val v = Validator()
  
  println(v.isValidName(""))
  println(v.isValidAge(25))
  println(v.isValidAge(-1))
  println(v.isValidAge(130))
  
  println(v.isValidName("Vikash"))
  println(v.isValidName(""))
  println(v.isValidName("A"))
}