data class Person(val name: String , val age: Int? = null){
  fun isOlderThan(other : Person): Boolean? {
    if( age == null || other.age == null) return null
    
    return age > other.age
  }
}
fun main(){
  println(Person("Vikash",33).isOlderThan(Person("Assis",40)))
  println(Person("Anmol",60).isOlderThan(Person("Bob",20)))
  println(Person("Alice").isOlderThan(Person("Vikash")))
}