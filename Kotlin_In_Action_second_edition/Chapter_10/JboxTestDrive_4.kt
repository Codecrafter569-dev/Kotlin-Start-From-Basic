interface JBox<T>{
  fun put(t: T & Any)
  fun putIfNotNull(t: T)
}

class KBox<T> : JBox<T>{
  override fun put(t:T & Any){
    println("Putting : $t")
  }
  override fun putIfNotNull(t : T){
    if( t != null) println("Putting if not null : $t")
  }
}
fun main(){
  val box = KBox<String?>()
  box.put("Hello")
//box.put(null)
  box.putIfNotNull(null)
  box.putIfNotNull("World")
}