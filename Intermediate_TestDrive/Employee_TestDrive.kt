open class Employee(val name: String,val salary: Int)

class Manager(name: String,salary: Int,val bouns: Int): Employee(name,salary)
fun main() {
    val v1 = Manager("Vikash",70000,2000)
    println("Name:${v1.name},Salary:${v1.salary},Bouns:${v1.bouns}")
}