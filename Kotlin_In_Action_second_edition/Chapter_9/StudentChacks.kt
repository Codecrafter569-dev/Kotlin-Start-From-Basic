data class Student(val id: Int,val name: String)
fun main(){
  val s1: Student? = Student(1,"Alice")
  val s2 : Student? = Student(1,"Alice")
  val s3 : Student? = Student(2,"Vikash")
  val s4 : Student? = null
  val s5 : Student? = null
  
  println(s1 == s2)
  println(s1 == s3)
  println(s3 == s4)
  println(s4 == s1)
  
  
  println(s3 === s4)
  println(s1 === s1)
  println(s1 === s2)
  
}