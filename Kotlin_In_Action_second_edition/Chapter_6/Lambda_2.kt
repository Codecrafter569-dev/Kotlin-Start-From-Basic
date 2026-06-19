data class Person(val name:String,val age:Int)
fun main(){
  val people = listOf(Person("Alice",26),Person("Bob",29),Person("Carlo",31),Person("Dave",24))
  
  val result = people.filter{it.age < 30 }.map{ it.name.uppercase() }
  
  println(result)
}