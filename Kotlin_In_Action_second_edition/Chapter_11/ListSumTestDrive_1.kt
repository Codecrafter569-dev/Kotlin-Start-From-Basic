fun sumLengths(list: List<CharSequence>): Int {
  return list.sumOf{it.length }
}

fun main(){
  val strings : List<String> = listOf("Kotlin","Is","Hello","Nonoko")
  
  val total = sumLengths(strings)
  println("Total length : $total")
}