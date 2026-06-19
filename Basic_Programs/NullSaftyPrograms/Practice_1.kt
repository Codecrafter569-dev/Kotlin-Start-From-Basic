data class Employee(val name:String,var salary:Int)

fun employeeById(id: Int) = when(id){
  1 -> Employee("Mary",20)
  2 -> Employee("Vikash",45)
  3 -> null
  4 -> Employee("Aasis",100)
  5 -> Employee("Deepak",200)
  else -> null
}
fun salaryById(id: Int) = employeeById(id)?.salary?: 0
fun main() {
   println((1..5).sumOf {id -> salaryById(id) }) 
}