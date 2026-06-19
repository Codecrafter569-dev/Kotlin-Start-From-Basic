class Person(val name: String,var age: Int){
  fun introduce(){
    println("Hi ! Main $name hoon aur meri age $age hai.")
  }
  
  val isAdult: Boolean
    get() = age >= 18
}
fun main() {
    val s1 = Person("Vikash Kumar",17)
    val s2 = Person("Aasis Kumar",20)
    s1.introduce()
    s2.introduce()
    println(s1.isAdult)
    println(s2.isAdult)
}