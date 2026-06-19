inline fun <reified T> createInstance() : T {
  return T::class.java.getDeclaredConstructor().newInstance()
}
class Dog{
  fun speak() = println("Wooof !!!")
}
class Cat{
  fun speak() = println("Meow !!!")
}
fun main(){
  val dog = createInstance<Dog>()
  dog.speak()
  
  val cat = createInstance<Cat>()
  cat.speak()
}