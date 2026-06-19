class Email(val name: String)
fun loadEmails(person: Person):List<Email>{
  println("The Person Name is ${person.name}")
  return listOf(Email("vikash@gmail.com"),Email("alokkumar@gmail.com"),Email("sumit@kuamrgmali.com"))
}
class Person(val name: String){
  val emails: List<Email> by lazy{
    loadEmails(this)
  }
}
fun main(){
  val p = Person("Alice")
  println("Before first access")
  println(p.emails)
  
  println("After first access")
  println(p.emails)
}