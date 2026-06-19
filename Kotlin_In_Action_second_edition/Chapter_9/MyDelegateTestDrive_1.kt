import kotlin.reflect.KProperty

class MyDelegates{
  operator fun getValue(thisRef: Any?,prop: KProperty<*>): String{
    println("Getting value of ${prop.name} from $thisRef")
    return "Hello from Delegates"
  }
  operator fun setValue(thisRef:Any?,prop:KProperty<*>,value: String){
    println("Setting value of ${prop.name} to $value")
  }
}
class Foo{
  var message : String by MyDelegates()
}
fun main(){
  val foo = Foo()
 val old = foo.message
 println("Got: $old")
 foo.message = "New Value"
}