data class Employee(
  val name: String,
  val department : String,
  val salary: Double,
  val yearsExperience: Int
)

val employees = listOf(
    Employee("Alice", "Engineering", 95000.0, 5),
    Employee("Bob", "Engineering", 75000.0, 2),
    Employee("Carol", "HR", 60000.0, 8),
    Employee("Dave", "Engineering", 110000.0, 10),
    Employee("Eve", "HR", 55000.0, 1)
)
fun List<Employee>.averageSalaryFor(predicate:(Employee) -> Boolean) : Double  = filter(predicate).map{it.salary}.average()
fun main(){
  println(employees.averageSalaryFor{it.department == "Engineering"})
  println(employees.averageSalaryFor{it.department == "Engineering" && it.yearsExperience  >= 5})
  
  println(employees.averageSalaryFor{it.salary > 70000  })
}