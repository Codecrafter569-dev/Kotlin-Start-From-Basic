data class Student(val name: String?, val age: Int?)
fun main() {
    val s1 = Student("Vikash Kuamr",null)
    println(s1.name?.uppercase() ?: "No Name")
    println(s1.age ?: "Age not available")
}