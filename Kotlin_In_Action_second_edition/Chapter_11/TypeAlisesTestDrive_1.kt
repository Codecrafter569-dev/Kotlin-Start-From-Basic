
  typealias NameCombiner = (String,String,String,String) -> String
  
  
  val authorCombine : NameCombiner = {a,b,c,d -> "$a et al.." }
  
  val bandCombiner : NameCombiner = { a,b,c,d-> "$a $b And $c The Gang" }
  fun combineAuthors(combiner : NameCombiner){
    println(combiner("Vikash","Yash","Anmol","Shahile"))
  }
fun main() {
  combineAuthors(bandCombiner)
  combineAuthors(authorCombine)
}