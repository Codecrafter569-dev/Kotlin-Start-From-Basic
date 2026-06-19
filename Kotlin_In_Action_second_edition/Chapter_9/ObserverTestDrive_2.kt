import kotlin.properties.Delegates
import kotlin.reflect.KProperty
class Person(val name: String,age:Int,salary:Int) : Observable(){
  private val onChange =
  {
    property:KProperty<*>,
    oldvalue:Any?,
    newValue:Any? ->
    notifyObservers(
    property.name,
    oldvalue,
    newValue
    )
  }
  
  var age by Delegates.observable(age,onChange)
  var salary by Delegates.observable(salary,onChange)
}
fun main(){
  
}