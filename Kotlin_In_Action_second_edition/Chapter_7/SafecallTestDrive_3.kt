class Address(val city : String,val country : String)
class Company(val name: String,val address: Address?)
class Person(val name: String,val company: Company?)
fun Person.countryName() : String {
  val com = this.company?.address?.country
return if(com != null ) com else "Unkown Address"
}
fun main(){
  val address = Address("Munich","Germany")
  val company = Company("Microsoft",address)
  val person1 = Person("Vikash Kumar",company)
  
  val address1 = Address("Jharkhand","Dhanbad")
  val company1 = Company("Google",null)
  val person2 = Person("Asis Kumar",company1)
  println(person1.countryName())
  println(person1.name)
  
  println(person2.countryName())
  println(person2.name)
}