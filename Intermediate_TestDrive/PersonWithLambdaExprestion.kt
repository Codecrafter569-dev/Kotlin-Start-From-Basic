class Person{
  var name = ""
  var age = 0
}
fun person(block: Person.() -> Unit): Person {
  val p = Person()
  p.block()
  return p
}
fun main() {
    val p =person {
      name = "Vikash"
      age = 23
    } 
    println(p.name)
    println(p.age)
}