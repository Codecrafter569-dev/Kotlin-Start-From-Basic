interface Greetable{
  fun sayHello(){
    println("Hello")
  }
}
class Person : Greetable
fun main() {
   val  p1 = Person()
   p1.sayHello()
}