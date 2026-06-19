data class Student(val name: String,val age:Int,val cla:String)
data class Employee(val name:String,var salary:Int)
fun main() {
    val user = Student("Vikash",16,"X")
    val e1 = Employee("Vikash",50000)
    val e2 = Employee("Aasis",80000)
    println(e1)
    e1.salary += 10000;
    println(e1)
    println()
    println(e2)
    e2.salary += 50000;
    println(e2)
    println(user.copy())
    println(user.copy("Aasis kumar"))
    println(user.copy(cla = "XI"))
}