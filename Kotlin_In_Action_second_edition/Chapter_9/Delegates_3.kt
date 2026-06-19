import kotlin.reflect.KProperty
class Delegate{
 private var stord = ""
  operator fun getValue(thisRef:Any?,property:KProperty<*>): String {
    println("Getting ${property.name}")
    return stord
  }
  operator fun setValue(thisRef:Any?,property:KProperty<*>,value: String){
    println("Setting ${property.name} to $value")
    stord = value
  }
}
class Person{
  var name: String by Delegate()
}
fun main(){
  val p = Person()
  p.name = "Vikash"
  println(p.name)
}