class Employee {
  var name: String = ""
    get() = field.replaceFirstChar{it.uppercase()}
    set(value) { field = value.trim()}
}
fun main() {
    val v1 = Employee()
    v1.name = "   vikash   "
    println(v1.name)
    v1.name = " aasis"
    println(v1.name)
}