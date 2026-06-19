class Person{
  val firstName: String
  val lastName : String

 constructor(fullName: String){
   val parts = fullName.split(" ")
   firstName = parts[0]
   lastName = if(parts.size > 1) parts[1] else ""
 }
 constructor(firstName: String, lastName: String){
   this.firstName = firstName;
   this.lastName  = lastName;
 }
}
fun main(){
  val v1 = Person("Vikash Kumar")
  val v2 = Person("Asis Kumar")
  
  println("First Name : ${v1.firstName}")
  println("Last Name : ${v2.lastName}")
}