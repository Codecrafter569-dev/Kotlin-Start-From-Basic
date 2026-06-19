class Person {
  var age: Int = 10
     get() = field+10
     set(value){
       field = when {
         value < 0 -> 0
         value > 150 -> 150
         else        ->value
       }
     }
}
fun main() {
    val p1 = Person()
    //p1.age = 
    println(p1.age)
    p1.age = -18
    println(p1.age)
    p1.age = 60
    println(p1.age)
}