class Car{
  var brand = ""
  var model = " "
}
fun cars(block:Car.() -> Unit ): Car {
  val c = Car()
  c.block()
  return c
}

fun combine(block: String.(Int) -> String): String {
  return "Age:".block(20)
}
val square: Int.() -> Int = {
  this * this //+ block
}
fun main() {
    val c = cars{
      brand ="BMW"
      model = "BMWXLI143"
    }
    println(c.brand)
    println(c.model)
    
    val result1 = combine {
      this + it
    }
    println(result1)
    println(90.square())
    
    
}