interface Producer<out T>{
  fun produce(): T
}

class AnimalProducer : Producer<Animal>{
  override fun produce() : Animal = Animal("Generic Animal")
}
class DogProducer : Producer<Dog>{
  override fun produce() : Dog = Dog("Rex")
}
open class Animal(val name: String)
class Dog(name: String) : Animal(name)

fun printProduced(producer : Producer<Animal>){
  println("Produced : ${producer.produce().name}")
}
fun main(){
  val dogProducer : Producer<Dog> = DogProducer()
  printProduced(dogProducer)
}