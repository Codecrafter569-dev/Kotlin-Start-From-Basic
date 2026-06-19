fun main(){
  val letters = Array(28) { i -> ('a'+i).toString()}
  println(letters.joinToString(""))
  
  val squares = Array(5) { i -> i*i }
  println(squares.joinToString())
  
  val default = Array(4){ "empty"}
  println(default.joinToString())
}