fun printFirstElements(list: List<Any>){
  println("First : ${list.first()}")
}
fun printFullSumOfStr(list: List<CharSequence>): Int {
  return list.sumOf{ it.length }
}
fun main(){
  val strings: List<String> = listOf("Kotlin","Java","Python","Hello bro")
  println("First Element of List is :${printFirstElements(strings)}")
  println(printFullSumOfStr(strings))
}