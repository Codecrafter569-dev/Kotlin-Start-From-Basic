data class Person(val name:String,val age:Int)
fun main(){
  val canBeInClub27 = {p : Person -> p.age <= 27 }
  val people = listOf(Person("Alice",27),Person("Bob",31))
  
  println(people.all(canBeInClub27))
  
  println(people.any(canBeInClub27))
  
  val list1 = listOf(2,4,6)
  
  println(list1.all{it % 2 == 0})
  println(list1.any{it > 5})
}