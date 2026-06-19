data class Person(val name: String,val age:Int){
  object ByName: Comparator<Person>{
    override fun compare(p1: Person,p2: Person): Int = p1.name.compareTo(p2.name)
    }
    
    object ByAge : Comparator<Person>{
   override fun compare(p1:Person ,p2:Person): Int = p1.age.compareTo(p2.age)
     }
     
     
    object ByAgeDesending : Comparator<Person> {
      override fun compare(p1: Person,p2 : Person): Int =
      p2.age.compareTo(p1.age)
    }
     
  
}
fun main(){
  val people  = listOf(
  Person("Bob",34),
  Person("Alice",28),
  Person("Carol",30),
  Person("Dave",41)
  )
  println(" - By Name -")
  people.sortedWith(Person.ByName).forEach{ println("$it")}
  println(" - By Age -")
  people.sortedWith(Person.ByAge).forEach{println("$it") }
  
  println(" By Age Desending Order ..")
  people.sortedWith(Person.ByAgeDesending).forEach{println("$it")}
  
  
  
  println("— By Age then Name —")
    people.sortedWith(
        compareBy<Person> { it.age }.thenBy { it.name }
    ).forEach { println("  $it") }
}