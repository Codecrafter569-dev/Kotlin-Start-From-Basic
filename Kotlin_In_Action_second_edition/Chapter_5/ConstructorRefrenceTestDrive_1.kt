data class Person(val name: String,val age: Int)

fun Person.isAdult() : Boolean = age >= 21

fun main(){
  val createPerson = ::Person
  
  val c = createPerson("Aasis",39)
  println(c)
  
  val rawData = listOf("Gamaaa" to 22, "Hello" to 17 , "Charlie" to 43)
  
  val people = rawData.map{ (name,age) -> createPerson(name,age) }
  
  println(people)
  
  val predicate : (Person) -> Boolean = Person::isAdult
  val adults = people.filter(predicate)
  println(adults)
  
  println(predicate(Person("Teen",16)))
  println(predicate(Person("Adult",33)))
  
}