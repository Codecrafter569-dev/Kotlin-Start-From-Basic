data class Person(val name: String, val salary: Double)

object Payroll {
    val allEmployees = mutableListOf<Person>()

    fun addEmployee(person: Person) {
        allEmployees.add(person)
        println("Hired: ${person.name}")
    }

    fun calculateTotalSalary(): Double = allEmployees.sumOf { it.salary }

    fun report() {
        println("=== PayRoll Report ===")
        allEmployees.forEach {
            println("${it.name} : ${"%.2f".format(it.salary)}")
        }
        println("Total : ${"%.2f".format(calculateTotalSalary())}")
    }
}

fun main() {
    Payroll.addEmployee(Person("Vikash kumar", 89_000.0))
    Payroll.addEmployee(Person("Assis kumar", 110_000.0))
    Payroll.addEmployee(Person("Alok kumar", 82_000.0))

    Payroll.report()

    val ref1 = Payroll
    val ref2 = Payroll
    println(ref1 === ref2)
}