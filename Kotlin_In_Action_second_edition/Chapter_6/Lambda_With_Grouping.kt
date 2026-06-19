data class Person(val name:String,val age:Int)
fun main(){
  val people = listOf(Person("Alice",31),Person("Bob",27),Person("Caro",32),Person("Sinra",17))
  
  val byageMap = people.groupBy{it.age}
  println(byageMap)
  
  val byNameMap = people.groupBy{it.name}
  println(byNameMap)
  
  val list1 = listOf("apple","apricot","banana","cantaloupe","avocardo")
  val byFirstlatter = list1.groupBy(String::first)
  println(byFirstlatter)
  
  val nameToAge = people.associate{it.name to it.age }
  println(nameToAge)
  println(nameToAge["Alice"])
  
  val personToage = people.associateWith{it.age}
  println(personToage)
  
  val ageToPerson = people.associateBy{it.age}
  println(ageToPerson)
  
  val n1 = people.associateWith{it.name}
  val n2 = people.associateBy{it.name}
  
  println(n1)
  println(n2)
}