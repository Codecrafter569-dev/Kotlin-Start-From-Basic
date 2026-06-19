data class Person(val name: String,val age:Int)
fun findTheOldest(people: List<Person>){
  var maxAge = 0
  var theOldest : Person? = null
  for(per in people){
    if(per.age > maxAge){
      maxAge = per.age
      theOldest = per
    }
  }
  println(theOldest)
}
fun main(){
  val people = listOf(Person("Alice",29),Person("BOb",72),Person("Vikash",22))
  
  findTheOldest(people)
}