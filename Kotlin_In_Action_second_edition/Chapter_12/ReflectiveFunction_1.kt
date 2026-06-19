import kotlin.reflect.KProperty1
var counter = 0

class Person(val name: String,val age: Int)
fun main(){
  val kProperty = ::counter
  kProperty.setter.call(392)
  println(kProperty.get())
  kProperty.set(100)
  println((kProperty.get()))
  
  val person = Person("Vikash",30)
  val memberProp: KProperty1<Person,Int> = Person::age
  
  println(memberProp.get(person))
}