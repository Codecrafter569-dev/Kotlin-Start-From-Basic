class Person{
  var name: String = ""
  set(value){
    field = value.replaceFirstChar{ firstChar -> firstChar.uppercase()}
  }
}
fun main() {
    val person = Person()
    person.name = "Kodee"
    println(person.name)
}