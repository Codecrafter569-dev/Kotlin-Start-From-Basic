class Student {
  var name:String = "Vikash"
  var age: Int = 0
  val schoolName: String = "Kotlin Academy"
}
fun main() {
  val s = Student()
  println(s.name)
  s.age = 28
  println(s.age)
  println(s.schoolName)
}