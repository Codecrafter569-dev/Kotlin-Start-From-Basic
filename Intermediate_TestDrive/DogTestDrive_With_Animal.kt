open class Animal {
  open fun sound(){
    println("Some animal sound")
  }
}
class Dog: Animal(){
  override fun sound(){
    println("The sound is Dog : Brak bark")
  }
}
fun main() {
    val a = Animal()
    val d = Dog()
    d.sound()
    a.sound()
}