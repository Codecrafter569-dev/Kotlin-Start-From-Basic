data class Person(val name:String,val age:Int)
fun main(){
  val num = listOf(1,2,3,4,5,6,7,8,9)
  val (even,odd) = num.partition{it % 2 == 0 } 
  println(even)
  println(odd)
  
  val people = listOf(Person("Viaksh",16),Person("Alok",20),Person("Bob",33),Person("Anmol",28))
  
  val (num1,num2) = num.partition{it > 5 }
  println(num1)
  println(num2)
  
  val canBeIn = {p:Person -> p.age <= 27 }
  
  val (comeIn,stayOut) = people.partition(canBeIn)
  println(comeIn)
  println(stayOut)
}