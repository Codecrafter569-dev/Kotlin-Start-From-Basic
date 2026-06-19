data class Person(val name:String,val age: Int)
val people = listOf(
Person("Alice",30),
Person("Bob",31),
Person("Charlie",25)
)

fun lookForAliceLoop(people : List<Person>){
  for(p in people){
    if(p.name == "Alice"){
      println("Found with loop!!!")
      return
    }
  }
  println("Alice is not found...")
}

fun lookForAliceFor(people: List<Person>){
  people.forEach{
    if(it.name == "Alice"){
      println("Found with forEach!!!")
      return
    }
  }
  
  println("Alice is not found....")
}
fun main(){
  lookForAliceLoop(people)
  lookForAliceFor(people)
}