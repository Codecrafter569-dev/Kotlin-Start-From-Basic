data class Person(val name: String,val age:Int)

fun lookForAliceWithCustomLable(people:List<Person>){
  people.forEach label@{
    if(it.name != "Alice") return@label
    
    println("Found Alice!!!")
  }
  
  println("Search complete...")
}

fun lookForAliceWithForEach(people: List<Person>){
  people.forEach{
    if(it.name != "Alice") return@forEach
    
    println("Found Alice!!")
  }
  println("Search complete...")
}
fun main(){
  val people = listOf(Person("Alice",30),Person("Bob",34))
  lookForAliceWithForEach(people)
  println("-----")
  lookForAliceWithCustomLable(people)
}