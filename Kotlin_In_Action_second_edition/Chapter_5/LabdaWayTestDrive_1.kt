data class Person(val name: String,val age: Int)

fun main(){
  val people = listOf(Person("Vikash",22),Person("Bob",33),Person("Okaya",44))
  
  val oldest = people.maxByOrNull{ it.age }
  println(oldest)
}