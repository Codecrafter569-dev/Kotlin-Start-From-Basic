class Address(val streetAddress:String,val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String,val company: Company?)

fun printShippingLabel(person: Person){
  val address = person.company?.address ?: throw IllegalArgumentException("No address")
  
  with(address){
    println(streetAddress)
    println(zipCode)
    println(city)
    println(country)
  }
}
fun main(){
  val address = Address("Elsestr. 48",80687,"Munich","Germany")
  
  val jetbrains = Company("JetBrains",address)
  val dmitry = Person("Vikash",jetbrains)
  
  printShippingLabel(dmitry)
  
  printShippingLabel(Person("Asis",null))
}