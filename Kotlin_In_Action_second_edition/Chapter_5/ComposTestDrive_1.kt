fun compose(f:(Int) -> Int, g:(Int) -> Int) : (Int) -> Int {
  return {x -> f(g(x)) }
}
fun main(){
  val addOn = {x: Int -> x + 1 }
  val doubleOn = {x: Int -> x * 2}
  
  val doubleThenAdd = compose(addOn,doubleOn)
  println(doubleThenAdd(58))
}