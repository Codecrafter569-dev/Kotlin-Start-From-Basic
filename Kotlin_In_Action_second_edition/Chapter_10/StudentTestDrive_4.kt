data class Student(val name: String,val grade: Int,val passed: Boolean)

val students = listOf(
Student("Alice",89,true),
Student("Bon",34,false),
Student("Carol", 91, true),
    Student("Dave", 35, false),
    Student("Vikash",99,true)

)

fun findFirstFailure(students: List<Student>): Student?{
  students.forEach{
    student -> if(!student.passed){
      println("First failure : ${student.name}")
      return student
    }
    
  }
  
  return null
}

fun printPassedStudents(students: List<Student>){
  students.forEach{
    student -> if(!student.passed) return@forEach
    println("Passed: ${student.name}")
    
  }
  
  println("All Done!1")
}
fun main(){
  val first = findFirstFailure(students)
  println("Result : ${first?.name}")
  
  println("-------------------------------------"
  )
  printPassedStudents(students)
}