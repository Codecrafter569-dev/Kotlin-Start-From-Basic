class Person(
val name: String,
var isStudent : Boolean

)
fun main() {
    val p1 = Person("Vikash Kumar",true)
    println(p1.name)
    println(p1.isStudent)
    p1.isStudent = false
    println(p1.isStudent)
}