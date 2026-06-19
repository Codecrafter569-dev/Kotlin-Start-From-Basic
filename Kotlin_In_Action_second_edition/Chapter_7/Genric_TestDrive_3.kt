class NullableBox<T>(val value: T){
  fun getOrDefault(default: T & Any): Any = value ?: default
}
class NonNullBox<T : Any>(val value: T){
  fun get(): T = value
}
fun main(){
  val box1 = NonNullBox("Kotlin")
  val box2 = NonNullBox(3349)
//  val box3 = NonNullBox(null)
  
  val box4 = NullableBox("Vikash")
  val box5 = NullableBox(8330)
  val box6 = NullableBox(null)
  
  println(box1.get())
  println(box2.get())
  //println(box3.get())
  
  println(box4.getOrDefault("Hello"))
  println(box5.getOrDefault(393))
// println(box6.getOrDefault("not null"))
}