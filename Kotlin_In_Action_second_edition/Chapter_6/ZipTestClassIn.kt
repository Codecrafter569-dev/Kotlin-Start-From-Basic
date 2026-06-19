data class Person(val name:String,val age:Int)
fun main(){
  val names = listOf("Joe","Mary","Jamie")
  val ages = listOf(22,31,44,0)
  
  println(names.zip(ages))
  println(ages.zip(names))
  
  val people = names.zip(ages) {
    name , age -> Person(name,age)
  }
  println(people)
  
  
  println(names zip ages)
  println(ages zip names)
  
  val countries = listOf("DE","NL","US")
  val combined = names zip ages zip countries
  println(combined)
  
  
  
}