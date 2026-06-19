import kotlin.reflect.KProperty

fun interface Observer{
  fun onChange(name:String,oldValue:Any?,newValue:Any?)
}
open class Observable{
  val obervers = mutableListOf<Observer>()
  fun notifyObservers(propName:String,oldValue:Any?,newValue: Any?){
    for(obes in obervers){
      obes.onChange(propName,oldValue,newValue)
    }
  }
}

class ObservableProperty(var propValue:Int,val observable: Observable){
  operator fun getValue(thisRef:Any?,prop: KProperty<*>): Int = propValue
  operator fun setValue(thisRef:Any?,prop:KProperty<*>,newValue:Int){
    val oldValue = propValue
    propValue = newValue
    observable.notifyObservers(prop.name,oldValue,newValue)
  }
}
class Person(val name: String,age:Int,salary:Int): Observable(){
  var age by ObservableProperty(age,this)
  var salary by ObservableProperty(salary,this)
}
fun main(){
  val p = Person("Vikash",30,100)
  p.obervers += Observer{propName,oldValue,newValue ->
  println("[$propName] $oldValue   ->  $newValue")
  }
  p.age = 50
p.salary = 20000
}
