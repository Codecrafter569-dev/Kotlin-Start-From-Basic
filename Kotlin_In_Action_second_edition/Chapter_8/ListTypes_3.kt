data class StudentScore(val name: String, val score: Int?)
fun printReport(scores: List<StudentScore>){
  val valid = scores.filter{it.score != null }
  val invalid = scores.filter{it.score == null }
  
  println("=== Score Report ===")
  valid.forEach{ println("${it.name} : ${it.score}") }
  invalid.forEach{ println("${it.name} : NOT SUMITEDED") }
  
  val avg = valid.mapNotNull{ it.score}.average()
  println("Class average : ${"%.1f".format(avg)}")
}
fun main(){
  val s1 = listOf(
  
  StudentScore("Alice", 88),
        StudentScore("Bob", null),
        StudentScore("Carol", 95),
        StudentScore("Dave", null),
        StudentScore("Eve", 72)
  
  )
  
  
  println(s1)
}