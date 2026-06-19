data class Person(val name: String,var age:Int)
fun main(){
  val person = Person("Alice",28)
  
  val greeting = person.let {"Hello , ${it.name}" }
  println(greeting)
  
  val info = person.run { "Hello, $name and this is your age : $age"}
  println(info)
  
  
  val summery = with(person) {" ${name.uppercase()}: age $age "}
  println(summery)
  
  val updated = person.apply{ age = 29 }
  println(updated)
  println(person === updated )
  
  
  val result = person.also{ println("Processing : ${it.name}") }
  
  println(result)
}