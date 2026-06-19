class Address(val city: String,val country: String)
class Company(val name: String,val address: Address?)
class Person(val name: String,val company: Company?)

fun getCity(person: Person) : String = person.company?.address?.city ?: "City Unknown"
fun getContry(person: Person) : String = person.company?.address?.country  ?: "country Unknown"

fun main(){
  val a1 = Address("Dhanbad","India")
  val c1 = Company("SANKIAAO",a1)
  val p1 = Person("Vikash",c1)
  
  println(getCity(p1))
  println(getContry(p1))
  
  val a2 = Address("Jharkhand","India")
  val p2 = Person("Tech GmbH",null)
  println(getContry(p2))
  println(getCity(p2))
}