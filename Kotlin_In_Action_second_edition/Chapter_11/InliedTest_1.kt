inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
  val destination = mutableListOf<T>()
  for(element in this){
    if(element is T){
      destination.add(element)
    }
  }
  
  return destination
}
fun main(){
  val items = listOf("Vikash",78,"Three",893.9,true,"Ok")
  val strings = items.filterIsInstance<String>()
  val intList = items.filterIsInstance<Int>()
  val boolList = items.filterIsInstance<Boolean>()
  
  
  println(items)
  println(strings)
  println(intList)
  println(boolList)
}