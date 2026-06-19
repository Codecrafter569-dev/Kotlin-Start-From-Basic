data class Person(val name:String,val age:Int)
fun main(){
  val canBeInClub27 = {p: Person -> p.age <= 27 }
  
  val people = listOf(Person("Alice",27),Person("Bob",34))
  
  println(people.count(canBeInClub27))
  println(people.filter(canBeInClub27).size)
  println(people.find(canBeInClub27))
  
  
  val nums = listOf(4,7,9,10,12)
  println(nums.count{it > 8})
  println(nums.find{it % 2 == 0})
}