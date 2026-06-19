data class Student(val name: String,val marks:Int)
val Student.grade : String
    get() = when {
      marks >= 90 -> "A+"
      marks >= 80 -> "A"
      marks >= 70 -> "B"
      marks >= 60 -> "C"
      else        -> "F"
    }
    
val Student.hasPassed: Boolean
     get() = marks >= 60
fun main() {
    val students = listOf(Student("Vikash",95),Student("Shahile Kumar",78),Student("Nafisa",55))
    
    students.forEach{
      println("${it.name}: Grade= ${it.grade}, Passed=${it.hasPassed}")
    }
}