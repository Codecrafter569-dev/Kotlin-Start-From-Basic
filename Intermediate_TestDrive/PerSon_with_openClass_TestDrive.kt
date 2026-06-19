open class Person(val name: String)
class Student(name: String): Person(name)
fun main() {
    val s1 = Student("Nafisa")
    println(s1.name)
}