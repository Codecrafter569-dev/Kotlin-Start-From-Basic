import kotlin.random.Random
fun main() {
    val firstScore = Random.nextInt(6)
    val secondScore = Random.nextInt(6)
    
    if (firstScore == secondScore) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
    
    go()
}

fun go(){
  val  button = "A"
  
  val output = when (button) {
      "A" -> "Yes"
      "B" -> "No"
      "C" -> "Menu"
      "D" -> "Nothing"
      else -> "There is no button"
  }
  
  println(output)
  
//  println( 1 .. 44)
//  println(44 downTo 1)
//  println(1..<7)


}