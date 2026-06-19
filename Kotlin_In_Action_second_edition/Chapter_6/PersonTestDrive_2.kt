data class Person(val name: String,val age:Int)
fun main(){
  val people = listOf(
  Person("Alice",29),
  Person("Vikash",28),
  Person("Bob",30),
  Person("Hello",32)
  )
  val maxAge = people.maxByOrNull(Person::age)?.age
  val oldestPeople = people.filter{it.age == maxAge }
  
  println(maxAge)
  println(oldestPeople)
  
  val listNum = listOf(10,20,30,40,50,60,70,80,90)
  val maxNum = listNum.maxOrNull()
  println(listNum.filter{it == maxNum})
}