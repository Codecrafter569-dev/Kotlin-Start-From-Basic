data class Person(val name: String,val age: Int)
fun yellAt(person: Person){
  println(person.name.uppercase()+"!!!")
}
fun main(){
  yellAt(Person("Alice",93))
 // yellAt(Person(null))
}