
fun alphabet(): String{
  val result = StringBuilder()
  
  for(letter in 'A'..'Z'){
    result.append("$letter ,")
  }
  result.append("Now I know the alphabet ")
  return result.toString()
}
fun main(){
  println(alphabet())
}