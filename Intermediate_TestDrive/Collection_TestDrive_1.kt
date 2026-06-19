fun main() {
    val list1 = listOf("apple","banana","KiwiFruit","Patato","matuu")
    for (list in list1) {
        println(list)
    }
    
    when{
      "apple" in list1 -> println("Apple is fine to yes.")
      "orange" in list1 -> println("This is so juciy")
      else ->println("unknown fruit..")
    }
    
    val fruits = listOf("banana","vikash","Shahile","Piyous","Nafisa","aasis")
    
    fruits.filter{ it.startsWith("a")}
          .sortedBy{it}
          .map {it.uppercase()}
          .forEach{println(it)}
          
println(fruits)
}