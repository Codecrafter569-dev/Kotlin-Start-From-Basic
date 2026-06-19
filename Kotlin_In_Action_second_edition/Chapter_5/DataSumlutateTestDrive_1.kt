fun salute()  = println("Salute!")
data class Person(val name: String,val age:Int)
fun sendEmail(person: Person,message: String){
  println("Sending ${message} to ${person.name}")
}



fun main(){

  run { salute() }
  run(::salute)
  
  val action = { person: Person , message : String -> sendEmail(person,message)
  }
  
  val nextAction = ::sendEmail
  
  val alice = Person("Alice",29)
  action(alice,"Hello via lambda")
  
  nextAction(alice,"Hello via Reference")
  
  println(action::class)
  println(nextAction::class)
  }
