import kotlin.reflect.KProperty
class Delegate{
  operator fun getValue(thisRef:Any?,property:KProperty<*>): String{
    return "How i can help you"
  }
  operator fun setValue(thisRef:Any?,property:KProperty<*>,value:String){
    println("New Name = $value")
  }
}
fun main(){
 var name : String by Delegate() 
 println(name)
 name = "Vikash what are you doing....."
 println(name)
}