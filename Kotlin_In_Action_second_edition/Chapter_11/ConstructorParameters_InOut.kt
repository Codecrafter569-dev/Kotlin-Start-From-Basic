open class Animal(val name: String){
  fun feed() = println("Name is $name and this person is now go to do eat...")
}
class Cat(name : String) : Animal(name){
  fun cleanLitter() = println("$name cleaned litters... ")
}
class Hard<out T : Animal>(vararg animals : T){
  private val animalList = animals.toList()
  val size : Int get() = animalList.size
  
  operator fun get(i: Int) = animalList[i]
}
class SafeHard<out T : Animal>(private var leadAnimal: T,vararg animals : T){
  val size: Int get() = 1
  operator fun get(i :Int) : T = leadAnimal
  fun getLead(): T = leadAnimal
}

fun feedAll(animals: Hard<Animal>){
  for(i in 0..<animals.size) animals[i].feed()
}
fun main(){
  val cats = Hard(Cat("Luna"),Cat("Mochi"),Cat("Socks"),Cat("Veno"))
  feedAll(cats)
  println(cats.size)
  println(cats.get(2).name)
  val safeCats = SafeHard(Cat("Vino"),Cat("NoNuChii"))
  println(safeCats.get(2).name)
  println(safeCats.getLead().name)
  println(safeCats.size)
  
  
}