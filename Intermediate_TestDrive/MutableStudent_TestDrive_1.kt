class MutableStudent(val props: MutableMap<String,Any>) {
    var name: String by props
    var score: Int by props
}

fun main() {
    val props = mutableMapOf<String,Any>("name" to "Vikash","score" to 900)
    
    val student = MutableStudent(props)
    
    println("${student.name} scored ${student.score}")
    student.score = 80
    println("Updataed score: ${student.score}")
    println("Man now :$props")
}