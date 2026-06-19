data class Person(val name: String,val age : Int)
fun main(){
  val people = listOf(
   Person("Alice",30),
   Person("Bob",34),
   Person("Vikash",44)
  )
  
  val oldest1 = people.maxByOrNull{ person : Person -> person.age }
  
  val oldest2  = people.maxByOrNull{ it.age }
  val oldest3 = people.maxByOrNull(Person::age)
  
  
  println(oldest1)
  println(oldest2)
  println(oldest3)
  
  val getAgeAsLambda : (Person) -> Int = { person -> person.age }
  
  val getAgeAsRef: (Person)  -> Int  = Person::age
  
  println(getAgeAsLambda(Person("Diana",28)))
  println(getAgeAsRef(Person("Hello",12)))
}