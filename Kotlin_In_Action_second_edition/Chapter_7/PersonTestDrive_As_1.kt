class Person(val firstName: String,val lastName: String){
  override fun equals(other: Any?): Boolean{
    val otherPerson = other as? Person ?: return false
    
    return otherPerson.firstName == firstName && otherPerson.lastName == lastName
  }
  
  override fun hashCode(): Int = 
              firstName.hashCode() * 37 + lastName.hashCode()
}
fun main(){
  val p1 = Person("Dmitry","Jemerov")
  val p2 = Person("Dmitry","Jemerov")
  val p3 = Person("Alice","Smith")
  
  println(p1 == p2)
  println(p1 == p3)
  println(p1 == null)
  println(p1.equals(42))
  
  val items : List<Any> = listOf("Hello",42,"World",3.14,"Kotlin",true,"Vikash")
  
  val stringsOnly = items.map{it as? String}.filterNotNull()
  
  println(stringsOnly)
  
  
  val string2 = items.filterIsInstance<String>()
  println(string2)
}