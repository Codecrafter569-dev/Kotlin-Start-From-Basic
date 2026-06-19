data class Person(val name:String,val age:Int)

fun lookForAlice(people: List<Person>){
  people.forEach(fun(person){
    if(person.name == "Alice") return
    
      println("${person.name} is not alice")
  })
println("Done searching...")
}
fun main(){
  val people = listOf(Person("Alice",30),Person("Bob",34))
  lookForAlice(people)
  
}