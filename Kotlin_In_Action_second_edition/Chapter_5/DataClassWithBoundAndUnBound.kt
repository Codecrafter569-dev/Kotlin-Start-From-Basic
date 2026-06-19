data class Person(val name: String,val age: Int)
fun main(){
  val seb = Person("Sebastian",26)
  
  
  val personsAgeFunction : (Person) -> Int = Person::age
  println(personsAgeFunction(seb))
  
  val personsAgeWithObj : () -> Int = seb::age
  println(personsAgeWithObj())
  
  val people = listOf(Person("Alice",30),Person("Bob",25))
  
  val ages = people.map(Person::age)
  
  println(ages)
  
  val getSebAge = seb::age
  val doSub = Person("Codecrafer569",33)
  val getAge12 = Person::age
  println("Seb is ${getSebAge()} years old")
  println("DoSub ${getAge12(doSub)} years old..")
}