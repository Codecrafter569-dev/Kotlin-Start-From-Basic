fun <T> List<T>.slice(indices: IntRange): List<T> = 
 
this.filterIndexed{ index, _ -> index in indices}
fun main(){
  val letters = ('a'..'z').toList()
  
  println(letters.slice<Char>(0..2))
  
  println(letters.slice<Char>(10..13))
}