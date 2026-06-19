open class Animal(val name: String)
class Dog(name: String) : Animal(name)
class Cat(name: String) : Animal(name)

fun acceptAnimal(a : Animal){
  println("Got animal : ${a.name}")
}
fun acceptNullableAnimal(a : Animal?){
  println("Got nullable Anime  :${a?.name}")
}
fun main(){
  val dog: Dog = Dog("Rex")
  val cat : Cat = Cat("Whiskets...")
  val animal : Animal = dog
  val nullableAnimal : Animal? = null
  
  acceptNullableAnimal(dog)
  acceptNullableAnimal(cat)
  acceptNullableAnimal(animal)
  acceptNullableAnimal(nullableAnimal)
  acceptAnimal(cat)
  acceptAnimal(dog)
  acceptAnimal(animal)
}