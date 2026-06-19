fun main() {
    println("Enter marks of 5 subject (out of 100):")
    
    println("Subject 1:")
    val s1 = readLine()!!.toDouble()
    println("Subject 2:")
    val s2 = readLine()!!.toDouble()
    println("Subject 3:")
    val s3 = readLine()!!.toDouble()
    println("Subject 4:")
    val s4 = readLine()!!.toDouble()
    println("Subject 5:")
    val s5 = readLine()!!.toDouble()
    
    val total = s1+s2+s3+s4+s5
    val percentage = total / 5
    
    val grade = when {
      percentage >= 90 -> "A+"
      percentage >= 80 -> "A"
      percentage >= 70 -> "B"
      percentage >= 60 -> "C"
      percentage >= 50 -> "D"
      else -> "F"
    }
    println("\nTotal Marks: $total")
    println("Percentage: $percentage")
    println("Grade: $grade")
}
