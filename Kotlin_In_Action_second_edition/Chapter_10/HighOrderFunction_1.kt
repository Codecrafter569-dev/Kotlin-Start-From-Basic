
fun main(){
  val sum = { a:Int,b:Int -> a+b}
  println(sum(483,94))
  val pe = { println("Vikash") }
  pe()
  
  val mutliplye : (Int,Int) -> Int = { a,b -> a*b}
  println(mutliplye(67,90))
  
  val actionExplicit: () -> Unit = {println("Hello how i can help you bro ....") }
  actionExplicit()
  
  val oddEven : (Int) -> Unit  = { a -> if(a%2 == 0){
    println("Even")
  }else{
    println("Odd")
  } }
  oddEven(88)
  oddEven(17)
  
  val funOrNull:(Int,Int) -> Int? = {x,y -> null }
  println(funOrNull(44,99))
  
  val canbeNull :((Int,Int) -> Int)? = null
  println(canbeNull)
}