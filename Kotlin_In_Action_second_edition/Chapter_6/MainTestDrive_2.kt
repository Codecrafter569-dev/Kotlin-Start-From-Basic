fun main(){
  val number = listOf(1,2,3,4,5,6,67,9)
  
  val filtered = number.filterIndexed{ index,element -> index % 2 == 0 && element > 4 }
  println(filtered)
  
  val mapped = number.mapIndexed{ index, element -> index+element}
  println(mapped)
  
  val letters = listOf("a","b","c","d","e")
  println(letters.filterIndexed{index,element ->index % 2 == 0})
  println(letters.mapIndexed{index,element -> "$index : $element"})
  
  val mapList = mapOf(0 to "zero",1 to "one")
  println(mapList.mapValues{it.value.uppercase()})
  
  val marks = mapOf("A" to 80,"B" to 90)
  println(marks.mapValues{it.value+5})
  
  
  
}