
fun main() {
    val score = 86
    
    val grade = if(score >= 90) "A" else if(score >= 80) "B" else "C"
    
    println("Grade: $grade")
    
    val day = 4
    val dayName = when(day){
      1 -> "Monday"
      2 -> "Tuesday"
      3 -> "Wednesday"
      4,5 -> "Thu or Fri"
      in 6..7 -> "Weekend"
      else -> "Invalied"
    }
    println(dayName)
    for(i in 1..5) print("$i ")
    println()
    
    for(i in 5 downTo 1 step 1) print("$i ")
    println()
    
    var count = 9
    while(count > 0){
      print("$count..")
      count--
    }
    println("Blast off!   ")
    
}