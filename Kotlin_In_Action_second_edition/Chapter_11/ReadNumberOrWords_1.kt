fun readNumberOrWords(): List<Any>{
println("Enter a someThing :")
  val input = "Vikash, 3982, Helo,8383, Tum ,hai, kaya b hello, bro, hami,8484848385, hai"
  val words: List<String> = input.split(",")
  val numbers : List<Int> = words.mapNotNull{
    it.toIntOrNull()
  }
  return numbers.ifEmpty{ words}
}
fun printList(l : List<Any>){
  when(l){
    
    
    is List<*>  -> println("It's some kind of list : $l")
  }
}
fun main(){

  val list = readNumberOrWords()
  printList(list)
}