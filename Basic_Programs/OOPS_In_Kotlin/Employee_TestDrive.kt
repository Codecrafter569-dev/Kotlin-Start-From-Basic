import kotlin.random.Random

data class Employee(val name:String,var salary: Int)

class RandomEmployeeGenerator(var minSalary:Int,var maxSalary:Int){
  val name = listOf("Vikash","Aasis","Deepak","Parwati")
  fun generatorEmployee() = Employee(name.random(),Random.nextInt(from = minSalary, until = maxSalary))
      
  
}
fun main() {
    val empGen = RandomEmployeeGenerator(10,30)
    println(empGen.generatorEmployee())
    println(empGen.generatorEmployee())
    println(empGen.generatorEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generatorEmployee())
}