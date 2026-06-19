data class Person(val firstName: String,val lastName: String)
val Person.fullName : String get() = "$firstName $lastName"

fun main() {
    val person = Person(firstName = "Vikash",lastName =" Kuamr")
    
    println(person.fullName)
}
