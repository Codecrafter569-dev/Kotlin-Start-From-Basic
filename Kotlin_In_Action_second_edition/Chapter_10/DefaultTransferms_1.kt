fun <T> transformOrDefault(items:List<T>,transform:((T) -> String)?

): List<String>{
  return items.map{ item -> 
  transform?.invoke(item) ?: item.toString()
  }
}
fun main(){
  println(transformOrDefault(listOf(1,2,34,5,6),null))
  
  println(transformOrDefault(listOf(23,40,78,90),{(it*10).toString()}))
  println(transformOrDefault(listOf("kotlin", "rocks")) { it.replaceFirstChar { c -> c.uppercase() } })
  
}