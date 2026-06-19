
fun main(){
  val score = listOf("Alice" to 90 , "Bob" to 85, "Charlie" to 92)
  
  val formatted = score.map{ (name,score) -> "$name:$score" }
  println(formatted)
  
  countTest()
}
fun countTest(){
  var count = 0;
  val increment = { count++}
  increment()
  increment()
  println(increment())
  increment()
  println(count)
  println(increment())
  
  val words = listOf("Kotlin","lambda","function")
  val upper = words.map(String::uppercase)
  println(upper)
  
  val words1 = listOf("Kotlin","is","awesome")
  val sentence = words1.fold(""){
    acc,word  -> 
    if(acc.isEmpty()) word else "$acc $word"
  }
  println(sentence)
}