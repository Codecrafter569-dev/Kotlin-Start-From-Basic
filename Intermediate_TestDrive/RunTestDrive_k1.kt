fun main() {
    val numners = mutableListOf(1,2,3)
    
    numners.also{
      println("Before adding: $it")
    }.add(12)
    println(numners)
    
    val name = "Vikash".also{
      println("Original: $it")
    }.uppercase()
    println(name)
}