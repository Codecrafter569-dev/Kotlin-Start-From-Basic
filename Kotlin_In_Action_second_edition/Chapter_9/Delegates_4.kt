import kotlin.reflect.KProperty
class Delegate{
private var age = 0
 operator fun getValue(thisRef:Any?,prop:KProperty<*>): Int{
   println("Now the Value is ${prop.name}")
   return age
 }
 operator fun setValue(thisRef:Any?,prop:KProperty<*>,value: Int){
   println("now the value is ${prop.name} and that is set to $value")
   age = value
 }
}
class Person{
  var age : Int by Delegate()
}
fun main(){
  val p = Person()
  p.age = 16
  println(p.age)
}