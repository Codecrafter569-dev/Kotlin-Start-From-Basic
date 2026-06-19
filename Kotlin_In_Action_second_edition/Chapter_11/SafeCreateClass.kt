inline fun <reified T> safeCreate() : T?{
  return try{
    T::class.java.getDeclaredConstructor().newInstance()
  }catch(e: Exception){
    println("Cannot instantiate ${T::class.simpleName} : ${e.message}")
    null
  }
}

class Simple
class NoDefaultConstructor(val x : Int)
fun main(){
  val s = safeCreate<Simple>()
  println(s)
  
  val n = safeCreate<NoDefaultConstructor>()
  println(n)
}