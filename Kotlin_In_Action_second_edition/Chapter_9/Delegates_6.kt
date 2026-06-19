import kotlin.reflect.KProperty
class Delegate{
  operator fun provideDelegate(thisRef:Any?,prop:KProperty<*>) : Delegate{
    println("Creating delegates for ${prop.name}")
    return this
  }
  operator fun getValue(thisRef:Any?,prop:KProperty<*>) : String {
    return "Hello"
  }
}
class Person{
  val name by Delegate()
}
fun main(){
  val p = Person()
  println(p.name)
}