data class Person(
    val name: String,
    val age : Int? = null
)
fun main() {
    val list1 = listOf(Person("Vikash",30),Person("Aasis Kumar"),Person("Yeash Kumar",55),Person("Nafisa",16))
    
   val l= list1.maxBy{
      it.age ?: 0
    }
    println(l)
    println(l.name)
    println(l.age)
    go(list1)
}
fun go(list: List<Person>){
 val l = list.minBy{
    it.age ?: 0
  }
  println(l.age ?: 0)
  println(l.name)
}