interface JSONFactory<T> {
  fun fromJSON(jsonText: String): T
}
class Person(val name: String){
  companion object : JSONFactory<Person> {
    override fun  fromJSON(jsonText: String): Person {
      val name = "Hello this is a jsonText :$jsonText"
      return Person(name)
    }
  }
}
fun main(){
  val b1 = Person.fromJSON("Println(Hello world)")
  println(b1.name)
}