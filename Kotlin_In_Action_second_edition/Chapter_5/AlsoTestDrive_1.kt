
fun main(){
  val fruits = listOf("Apple","Banana","Cherry")
  val uppercaseFruit = mutableListOf<String>()
  
  val reversedLongFruits = fruits.map{ it.uppercase() }
           .also{ uppercaseFruit.addAll(it) }
           .filter {it.length > 5 }
           .also{ println("Long fruit: $it") }
           
           .reversed()
           
           println("Uppercase (all) : $uppercaseFruit")
           println("Reversed long: $reversedLongFruits")
}