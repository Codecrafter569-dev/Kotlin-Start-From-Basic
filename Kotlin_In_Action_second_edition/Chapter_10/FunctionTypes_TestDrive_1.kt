val mutliply = {x:Int,y:Int -> x*y}
val greet = {name: String -> "Hello $name"}
val isEven = {n:Int  -> n % 2 == 0}
val safeDivistion :(Int,Int) -> Int? = {x,y -> if(y == 0) null else x/y}

val multiplyWith20 : (Int,Int) -> Int = {a,b -> a*20*b }
val greetPower : (String) -> String = {a -> "Hello bro , $a"}
val  isOdd : (Int) -> Boolean = { n -> n % 2 != 0 }

//var maybeOp: ((Int,Int) -> Int)? = null
//maybeOp = { a,b -> a + b }

fun main(){
  println(mutliply(20,30))
  println(greet("Vikash"))
  println(isEven(99))
  println(isEven(22))
  println(safeDivistion(10,0))
  println(safeDivistion(20,30))
  println(multiplyWith20(2,10))
  println(greetPower("Nafisa"))
  println(isOdd(13))
  ///println(maybeOp?.invoke(33,3))
//maybeOp = null
//println(maybeOp?.invoke(20,3))

var maybeOp: ((Int, Int) -> Int)? = null
    maybeOp = { a, b -> a + b }
    println(maybeOp?.invoke(5, 3))  // 8
    maybeOp = null
    println(maybeOp?.invoke(5, 3))  // null

val result = safeDivistion(20,0) ?: -1
println(result)
}
