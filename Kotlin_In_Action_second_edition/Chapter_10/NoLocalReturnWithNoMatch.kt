data class Person(val name: String,val age: Int)
fun lookForCharlie(people:List<Person>){
  people.forEach{
    if(it.name == "Charlie"){
      println("Found Charlie")
      return
    }
  }
  println("Charlie is not found!")
}
fun main(){
  val people = listOf(Person("Alice",29),Person("Bob",31))
  
  lookForCharlie(people)
}