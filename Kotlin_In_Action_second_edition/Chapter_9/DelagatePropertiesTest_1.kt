import kotlin.reflect.KProperty
class Delegate(){
  operator fun getValue(thisRef:Any?,property:KProperty<*>): String {
    return "Hello"
  }
  operator fun setValue(thisRef:Any?,property:KProperty<*>,value:String){
    println("New value = $value")
  }
}
class Person{
  var name: String by Delegate()
}
fun main(){
  val p = Person()
  println(p.name)
  p.name = "Vikash"
}