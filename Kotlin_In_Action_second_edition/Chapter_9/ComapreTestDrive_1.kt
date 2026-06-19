class Person(val firstName: String,val lastName: String): Comparable<Person>{
  override fun compareTo(other: Person): Int =
         compareValuesBy(this,other,Person::lastName, Person::firstName)
}
fun main(){
  val p1 = Person("Vikash","Kumar")
  val p2 = Person("Asisi","Kumar")
  
  println(p1 < p2)
  println(p2 > p1)
  println("abx" < "bac")
}