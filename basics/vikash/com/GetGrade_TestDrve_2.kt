fun getGrade(score: Int): String{
  return when {
    score >= 90 -> "A+"
    score >= 80  -> "A"
    score >= 70  -> "B"
    score >= 60  -> "C"
    else         -> "F"
  }
}

fun main() {
    print("Student  name: ")
    val name = readln()
    
    print("How Many subjects :")
    val subjectCount = readln().toInt()
    
    var totalScore = 0
    repeat(subjectCount) { i -> 
    print("Subject ${i+1} of Score (0-100) : ")
    val score = readln().toInt()
    totalScore += score
    }
    
    val average = totalScore.toDouble()/subjectCount
    val grade = getGrade(average.toInt())
    
    println("""
        
        ═══════════════════════════════
               RESULT  CARD
        ═══════════════════════════════
        Student  : $name
        Subjects : $subjectCount
        Total    : $totalScore
        Average  : ${"%.1f".format(average)}
        Grade    : $grade
        ═══════════════════════════════
    """.trimIndent())
}