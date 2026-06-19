class Person{
  var name = ""
  var age = 0
}

fun main() {
val list = mutableListOf<Int>().apply{
  add(20)
  add(30)
  add(40)
  add(50)
}
println("This is the mutable list:$list")
    val person = Person().apply{
      name = "Vikash"
      age = 16
    }
    //println(" = $name")
    println(person.name)
    println(person.age)
}