fun cal(items: List<Any>): Int{
  var totalLength = 0
  for(item in items){
    totalLength += if(item is String){
      item.length
    }else{
      0
    }
  }
  return totalLength
}

fun main() {
   val list1 = listOf("Vikash","Nandni","Nafisa","Deepak")
   val l: Int =  cal(list1)
   println(l)
}