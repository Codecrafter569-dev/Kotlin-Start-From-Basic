fun readNumber(text: String): List<Int?> {
  return text.lineSequence()
             .map{ it.trim().toIntOrNull() }
             .toList()
             
}
fun  main(){
  val input = "nabc\n3\n4\nbad"
  val number = readNumber(input)
  
  println(number)
  
  val listWithNulls: List<Int?> = listOf(1,null,3,null,5)
  
  println(listWithNulls.size)
  println(listWithNulls[1])
  
  val nullableList: List<Int>? = null
  println(nullableList?.size)
  println(nullableList?.sum())
  
  val readList : List<Int>? = listOf(1,2,3,45,6,7)
  println(readList?.size)
}