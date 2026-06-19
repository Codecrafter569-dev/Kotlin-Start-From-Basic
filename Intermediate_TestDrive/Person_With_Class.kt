open class Person(val name: String){
  fun showName(){
    println("Name: $name")
  }
}
class Student(name: String): Person(name)

fun main() {
    val s1 = Student("Vikash Kumar")
    s1.showName()
}