fun alphabete() = StringBuilder().apply {
  for(latter in 'A'..'Z'){
    append("$latter ,")
  }
  append("This is all alphabetes ...")
}.toString()
fun main(){
  println(alphabete())
}