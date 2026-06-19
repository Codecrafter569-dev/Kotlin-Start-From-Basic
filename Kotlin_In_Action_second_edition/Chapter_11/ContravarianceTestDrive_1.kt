sealed class Fruit{
  abstract val weight : Int
}
data class Apple(override val weight: Int,val color: String): Fruit()

data class Orange(override val weight: Int,val juciy: Boolean) : Fruit()


fun main(){
  val weightComparator  = Comparator<Fruit> { a, b -> a.weight - b.weight }
  
  val fruits : List<Fruit> = listOf(Orange(180,true),Apple(89,"Green"),Apple(150,"Yellow"))
  
  val apples: List<Apple> = listOf(
        Apple(50, "red"),
        Apple(120, "green"),
        Apple(155, "yellow")
    )
  println(fruits.sortedWith(weightComparator))
  println(apples.sortedWith(weightComparator))
}