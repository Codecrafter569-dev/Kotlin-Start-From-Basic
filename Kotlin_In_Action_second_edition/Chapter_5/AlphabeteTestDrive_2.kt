fun alphabete() = with(StringBuilder()){
  for(letter in 'A'..'Z'){
    append("$letter ")
  }
  append("\nThis is all alphabetes ....")
  toString()
}
fun main(){
  println(alphabete())
}