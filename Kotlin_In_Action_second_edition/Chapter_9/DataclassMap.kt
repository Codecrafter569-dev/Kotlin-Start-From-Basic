data class Person(val firstName: String,val lastName:String,val age:Int,val city:String)
fun introducePerson(p: Person){
  val(firstName,lastName,age,city) = p
  println("This is Name : $firstName, age: $age , city: $city")
}
fun introducePerson2(p: Person){
  val(firstName,lastName,age) = p
  println("Name : $firstName , LastName : $lastName ,age:  $age  ")
  
}
fun printOnfo(p:Person){
  val(firstName,_,age) = p
  println("Name : $firstName , Age : $age")
}
fun main(){
  val map = mapOf("Hello" to "Book","Kotlin" to "Kotlin in Action","Java" to "Core java volume 1")
  val p = Person("Vikash","Kumar",16,"Dhanbad")
  introducePerson(p)
  introducePerson2(p)
  printOnfo(p)
  map.forEach{(key,value) -> println("$key --- $value") }
}