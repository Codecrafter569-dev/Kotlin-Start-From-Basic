data class Person(val name: String,val age: Int)

fun main(){
  val people = listOf(Person("Alok",22),Person("Anmol",33),Person("Vikash",90))
  
  println(people.maxByOrNull({ p : Person -> p.age}))
  println(people.maxByOrNull(){ p: Person -> p.age })
  println(people.maxByOrNull{p: Person -> p.age})
  println(people.maxByOrNull{p -> p.age})
  println(people.maxByOrNull{ it.age })
  println(people.maxByOrNull(Person :: age))
}