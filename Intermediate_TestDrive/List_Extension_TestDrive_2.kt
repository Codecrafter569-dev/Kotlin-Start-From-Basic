val List<Int>.sum : Int
    get() = this.fold(0){ acc,n -> acc+n}

val List<Int>.average: Double
    get() = if(isEmpty()) 0.0 else sum.toDouble() / size
    
val List<String>.longestWord: String 
   get() = this.maxByOrNull{it.length} ?: ""
fun main() {
  val scores = listOf(85,90,78,92,88)
  println("Sum : ${scores.sum}")
  println("Average : ${scores.average}")
  
  val words = listOf("Kotlin","Java","Programming","Code")
  
  println("Longest: ${words.longestWord}")
}