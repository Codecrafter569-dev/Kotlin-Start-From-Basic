data class Person(val name: String,val age: Int)
class PrintData{
  fun printPerson(user: Person) : String = "${user.name} and  ${user.age}"
}
class ManageDataPrinter(val person: Person){
  lateinit var printData: PrintData;
  
  fun dataLoade(id: Int){
    println("The Id number one and A data is $id")
    println(printData.printPerson(person))
  }
}
fun main(){
  val p1 = Person("Vikash Kumar",16)
  val m1 = ManageDataPrinter(p1)
  m1.printData = PrintData()
  m1.dataLoade(12)
  
}