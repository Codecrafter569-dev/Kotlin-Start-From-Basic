open class Animal{
  val index : Int = 43
  
}
class Cat : Animal()
fun Animal.getIndex() : Int = this.index

fun enumerateCats(f:(Cat)  -> Number){
  val cat = Cat()
  val result : Number = f(cat)
  println("Result : $result")
}
fun main(){
  enumerateCats(Animal::getIndex)
}