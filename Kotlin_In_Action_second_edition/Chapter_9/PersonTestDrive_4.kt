data class Student(val name:String)
fun loadListOfStudent(school: School):List<Student>{
  println("Now the list of Student is created And School name is ${school.name}....")
  return listOf(Student("Vikash"),Student("Yash"),Student("Shahile"),Student("Anshu")) 
}
class School(val name: String){
  val students by lazy{
    loadListOfStudent(this)
  }
}
fun main(){
  val s = School("DAV +2 ucha vidalay ")
  s.students
  println(s.students)
}