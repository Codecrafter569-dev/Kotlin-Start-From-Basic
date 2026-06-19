fun readNumber(text: String) : List<Int?> {
  return text.lineSequence()
                   .map{ it.toIntOrNull() }
                   .toList()
}
fun main(){
  val input  = """
  8382
  niej
  837
  vikash
  8
  123
  
  hello
  """.trimIndent()
  
  val numbers = readNumber(input)
  println(numbers)
  
 // println(numbers.sum())
 
  val onlyValid = numbers.filterNotNull()
  println(onlyValid)
  println(onlyValid.sum())
}