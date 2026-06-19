class Person(val name: String){
  companion object Loader {
    fun fromJSON(jsonText: String): Person {
      val name = jsonText.substringAfter("\"name\": \"").substringBefore("\"")
      return Person(name)
    }
  }
}
fun main(){
  val person = Person.Loader.fromJSON("""{"name":"Dmitry"}""")
  val person2 = Person.fromJSON("""{"name": "Brent"}""")
  
  println(person.name)
  println(person2.name)
}