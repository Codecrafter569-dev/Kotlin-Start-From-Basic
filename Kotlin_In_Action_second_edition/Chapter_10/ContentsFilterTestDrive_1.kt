data class Person(val firstName:String,val lastName:String,val phoneNumbers:String?)

class ContactListFilters{
var prefix: String = ""
var onlyWithPhoneNumbwr : Boolean = false

fun getPredicate(): (Person) -> Boolean {
  val startsWithPrefix = {p: Person -> p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
  }

if(!onlyWithPhoneNumbwr){
  return startsWithPrefix
}
return { startsWithPrefix(it) && it.phoneNumbers != null }
}
}


fun main(){
  val contacts = listOf(
        Person("Dmitry", "Jemerov", "123-4567"),
        Person("Svetlana", "Isakova", null),
        Person("Dmitry", "Smith", null)
    )
    
    val filters = ContactListFilters()
    with(filters){
      prefix = "Dm"
      onlyWithPhoneNumbwr = true
    }
    println(contacts.filter(filters.getPredicate()))
    filters.onlyWithPhoneNumbwr = false
    println(contacts.filter(filters.getPredicate()))
}