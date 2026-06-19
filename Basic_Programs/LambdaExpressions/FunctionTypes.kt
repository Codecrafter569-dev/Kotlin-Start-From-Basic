val upperCaseString: (String) -> String = {text -> text.uppercase()}
    
fun main() {
    println(upperCaseString("how to do that bro"))
    val timeInMinutes = listOf(1,2,4,10,20)
    val min2sec = toSeconds("minutes")
    val totalTimeInSeconds = timeInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    
    println({text: String -> text.uppercase()}("hello"))
}

fun toSeconds(time: String): (Int) -> Int = when(time){
  "hour" -> {value -> value * 60 * 60}
  "minutes" -> {value -> value * 60 }
  "seconds" -> {value -> value}
  else -> {value -> value}
  }
