class Email
fun loadEmails(person: Person): List<Email>{
 println("Loading emails for ${person.name}") 
 return listOf(Email(),Email(),Email())
}
class Person(val name:String){
  val emails by lazy {
    loadEmails(this)
  }
}
fun main(){
  val p1 = Person("Vikash")
  p1.emails
  p1.emails
}