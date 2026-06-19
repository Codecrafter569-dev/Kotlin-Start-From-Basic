open class Animal {
 fun feed() { println("${this::class.simpleName} is eating ...") }  
}
class Cat : Animal(){
  fun cleanLitter(){ println("Cat cleaned its litter") }
}

class HardInvarient<T : Animal>(private val animals: List<T>){
  val size : Int get() = animals.size
  operator fun get(i:Int): T = animals[i]
  
}

class Herd<out T : Animal>(private val animals : List<T>){
  val size : Int get() = animals.size
  operator fun get(i:Int) : T = animals[i]
}
fun feedAll(animals: Herd<Animal>){
  for(i in 0..<animals.size){
    animals[i].feed()
  }
}
fun cleanCat(cats : Herd<Cat>){
  for(i in 0..<cats.size){
    cats[i].cleanLitter()
  }
  feedAll(cats)
}
fun main() {
  val cats = Herd(listOf(Cat(),Cat(),Cat(),Cat()))
  cleanCat(cats)
}