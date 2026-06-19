class Email(val address: String)
fun loadEmails(person:Person): List<Email>{
  println("Loading emails for ${person.name}....")
  return listOf(Email("alice@gmail.com"),Email("vikash@gmial.com"))
}
class Person(val name: String){
  private var _emails: List<Email>? = null
  val emails: List<Email>
           get(){
             if(_emails == null){
               _emails = loadEmails(this)
             }
             return _emails!!
           }
}
fun main(){
  val p = Person("Alice")
  println("Person created....")
  println(p.emails)
  println(p.emails)
}