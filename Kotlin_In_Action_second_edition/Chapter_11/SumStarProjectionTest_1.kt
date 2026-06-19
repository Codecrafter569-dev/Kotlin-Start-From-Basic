fun sumLength_star(list:List<*>): Int {
  var total = 0
  for(item in list){
    if(item is String){
      total += item.length
    }
  }
  return total

  
}
fun strLength(list: List<String>): Int{
  var total = 0
  for(i in list){
    total += i.length
  }
  return total
}
fun main(){
  val words = listOf("Kotlin","Java","Python","Alok","Kumar")
  
  println(sumLength_star(words))
  println(strLength(words))
}