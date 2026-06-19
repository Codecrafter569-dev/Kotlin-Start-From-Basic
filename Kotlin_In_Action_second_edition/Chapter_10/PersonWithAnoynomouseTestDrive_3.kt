data class Person(val name:String,val age:Int)
fun main(){
  val people = listOf(Person("Alice",29),Person("Bob",30),Person("Charlie",25))
  
  val youngPeople = people.filter(fun(p): Boolean {
    return p.age < 30
  })
  
  println(youngPeople)
  
  
  val youngPeople3 = people.filter(fun(person) = person.age < 30)
  
  println(youngPeople)
  println(youngPeople3)
}