class Person(val name: String,var age : Int){
  fun introduce(){
    println("My Name is $name and My Age is $age")
  }
  val isAdult = 
      if(age >= 18) "Adult" else "Not a Adult"
}
data class Point(val x: Int,val y: Int)
fun main() {
    val p1 = Person("Vikash",22)
    val p2 = Person("Aasis kumar",18)
    val p3 = Person("Nafisa kumari",20)
    p1.introduce()
    p2.introduce()
    p3.introduce()
    
    p1.age = 23
    
    val pi1 = Point(3,4)
    val pi2 = Point(3,4)
    val pi3 = pi1.copy(y = 10)
    
    println(pi1)
    println(pi1 == pi2)
    println(pi3)
    
}