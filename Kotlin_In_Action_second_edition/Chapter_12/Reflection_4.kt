import kotlin.reflect.KFunction2
fun sum(x:Int,y:Int) = x+y
fun foo(x:Int) = println("foo called with: $x")
fun main(){
  val kFoo = ::foo
  kFoo.call(828)
  val ksum = ::sum
  println(ksum.call(202,393))
  
  val ksum1 : KFunction2<Int,Int,Int> = ::sum
  val result1 = ksum1.invoke(232,493)
  val result2 = ksum1(90,90)
  println(result1)
  println(result2)
  
  println("The sum of two values like that we can say that how i can :${result1+result2}")
}