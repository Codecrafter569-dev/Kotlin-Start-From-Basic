enum class Grade(val minMarks: Int,val remark: String){
  A_PLUE(90,"Outstanding!***"),
  A(80,"Excellent!"),
  B(70,"Good "),
  C(60,"Average ."),
  FAIL(0,"Need more effort ");
  
  
  companion object {
    fun fromMarks(marks: Int): Grade {
      return entries.firstOrNull{ marks >= it.minMarks } ?: FAIL
    }
  }
}
fun main() {
    val marks = 85
    val grade = Grade.fromMarks(marks)
    println("Marks: $marks -> Grade: ${grade.name} -> ${grade.remark}")
}