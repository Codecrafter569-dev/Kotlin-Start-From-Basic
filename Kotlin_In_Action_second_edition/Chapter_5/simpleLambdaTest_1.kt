
data class Person(val name:String,val marks : Int)
fun main(){
  { println(34) }()
  go()
}
fun go(){
  val value = run {
    println("Calculating ....")
    100
  }
  println(value)
  
  val result = run {
    println("I'm Thinking !")
    println("I'm do some to more !! ")
    78
  }
  println(result)
  
  val sum1 = run {
    val a = 393
    val b = 3339
    a+b
  }
  println(sum1)
  
  val people = listOf(Person("Alice",29),Person("Bob",22),Person("vikash",44))
  val names = people.joinToString(
  separator = " ",
  transform = {p: Person -> p.name }
  )
  println(names)
  
  val names2 = people.joinToString(" "){ it.name }
  println(names2)
  val numbers = listOf(1,2,3,4)
  val result1 = numbers.joinToString(", "){ "Numbers : $it" }
  println(result1)
}