open class Animal{
 open fun eat(){
    println("Animal is eating.")
  }
}
 class Dog: Animal(){
   override fun eat(){
     println("Dog is eating .")
   }
 }
fun main() {
    val b1 = Dog()
    b1.eat()
}