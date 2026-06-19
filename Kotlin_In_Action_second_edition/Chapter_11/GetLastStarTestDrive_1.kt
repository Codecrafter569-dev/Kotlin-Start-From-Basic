fun  getLastStar(list : List<*>): Any?{
  return if(list.isNotEmpty()) list.last() else null
}

fun <T> getLastStarGenric(list: List<T>): T?{
return if(list.isNotEmpty()) list.last() else null
}

fun main(){
  val numbers = listOf(10,20,30,40,50,60)
  val lastStar: Any? = getLastStar(numbers)
  val asInt = lastStar as? Int
  println(asInt)
  
  val lastGenric : Int? = getLastStarGenric(numbers)
  println("Genric result: $lastGenric")
  
  val words = listOf("Hello","words")
  val lastWords : String? = getLastStarGenric(words)
  println("Last Words : $lastWords")
}