sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)

class Human(val humanName: String,val job: String): Mammal(humanName)
fun greetMammal(m : Mammal): String{
  when(m){
    is Human -> return "Hello ${m.name}; you'r working as a ${m.job}"
    is Cat -> return "Hello ${m.name}"
  }
}
fun main() {
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Vikash","Java Devaloper")))
}