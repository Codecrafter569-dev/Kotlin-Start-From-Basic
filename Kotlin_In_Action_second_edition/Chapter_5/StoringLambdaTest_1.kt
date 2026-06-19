fun main() {
    val operations = mapOf<String, (Int, Int) -> Int>(
        "add" to { a, b -> a + b },
        "sub" to { a, b -> a - b },
        "mul" to { a, b -> a * b }
    )

    println(operations["add"]!!(10, 5))  // 15
    println(operations["sub"]!!(10, 5))  // 5
    println(operations["mul"]!!(10, 5))  // 50
    val triple = multiplier(4)
    println(triple(9))
    println(triple(88))
    
    val num1 = listOf(1,2,3,4,5,6,7,8,9)
    val result = num1
                .filter{it *2 != 0 }
                .map{ it * it * it }
  
  
  println(result)
    
}
fun multiplier(factor:Int) :(Int) -> Int {
  return { number -> number * factor }
}