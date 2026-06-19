data class Person(val name: String?,val age: Int?)
fun yellAtSafe(person: Person){
  println((person.name ?: "AnyOne").uppercase()+"!!!")
}
fun main(){
  val p1 = Person("Vikash",16)
  println(p1)
  yellAtSafe(p1)
  yellAtSafe(Person(null,null))
}