fun interface Observer{
  fun onChange(name: String,oldValue: Any?,newValue:Any?)
}
open class Observable{
  val observers = mutableListOf<Observer>()
  
  fun notifyObervers(propName: String,oldValue: Any?,newValue:Any?){
    for(obes in observers){
      obes.onChange(propName,oldValue,newValue)
    }
  }
}

class Person(val name: String,age:Int,salary:Int): Observable(){
  var age: Int = age
     set(newValue){
       val oldValue = field
       field = newValue
       notifyObervers("age",oldValue,newValue)
       
     }
     
  var salary: Int = salary
       set(newValue){
         val oldValue = field
         field = newValue 
         notifyObervers("salary",oldValue,newValue)
       }
}
fun main(){
  val p = Person("Seb",29,1000)
  p.observers += Observer{propName,oldValue,newValue ->
    println("Property $propName changed from $oldValue  to $newValue")
  }
  
  p.age = 30
  p.salary = 10000
}