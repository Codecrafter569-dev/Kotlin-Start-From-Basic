data class Student(val name: String, val score: Double?)
fun main(){
  val students = listOf(
  Student("Vikash",78.9),
  Student("Bob",null),
  Student("Carol",90.8),
  Student("Dave",null),
  Student("Eve",82.93)
  )
  
  val scores = students.map{it.score }
  val valid = scores.filterNotNull()
  
  println("Submitted : ${valid.size}")
  println("Missing : ${scores.size - valid.size}")
  
  println("Average : ${"%.2f".format(valid.average())}")
}