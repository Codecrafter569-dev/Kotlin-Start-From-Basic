open class Animal{
  fun eat(){
    println("The animal is ready to eating")
  }
}
open class Dog: Animal(){
  fun run(){
    println("My dog is now ready to run fulley fast and not a break")
  }
}
fun main() {
    val b = Animal()
    b.eat()
    val d = Dog()
    d.eat()
    d.run()
}