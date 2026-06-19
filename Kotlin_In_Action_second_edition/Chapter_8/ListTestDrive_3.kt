fun main(){
  val readOnly : List<String> = listOf("a","b","c","d")
  val mutable: MutableList<String> = mutableListOf("a","b","c")
  
  println(readOnly.javaClass)
  println(mutable.javaClass)
  
  println(readOnly is java.util.List<*>)
  println(mutable is java.util.List<*>)
}