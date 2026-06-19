inline val <reified T> T.canonical : String 
        get() = T::class.java.canonicalName
fun main(){
  println(listOf(1,23,4,5,6,7,8,9,10,11,12,13,14,15,17,18).canonical)
  
  println(1.canonical)
  println("Vikash".canonical)
  println(90.9.canonical)
}