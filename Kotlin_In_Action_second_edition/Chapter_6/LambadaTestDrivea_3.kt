data class Person(val name:String , val age:Int)
fun main(){
  val list1 = listOf(Person("Vikash",34),Person("Alok",33),Person("Anmol",44),Person("Alex",27),Person("Nafisa",16))
  
  val filtered = list1.filter{it.age >= 27 }
  println(filtered)
  val canInClub27 : (Person) -> Boolean = {it.age <= 27 }
  val canIn = list1.filter(canInClub27)
  val cannotIn = list1.filterNot(canInClub27)
  
  println(canIn)
  println(cannotIn)
  
  val fruits = listOf("apple","apricot","banana","Kivi","avocado","cherry")
  
  val startWithAAllFruits = fruits.filter{it.startsWith("a")  }
  
  println(startWithAAllFruits)
}