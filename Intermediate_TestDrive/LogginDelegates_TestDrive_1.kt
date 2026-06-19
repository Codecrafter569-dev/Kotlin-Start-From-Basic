import kotlin.reflect.KProperty

class LoggingDelegate(private var value: String){
  operator fun getValue(thisRef: Any?,property: KProperty<*>) : String{
    println(" Getting '${property.name}' = $value")
    return value
  }
  operator fun setValue(thisRef: Any?,property: KProperty<*>,newValue: String){
    println("Setting '${property.name}' = $newValue")
    value = newValue
  }
}

class User {
  var username: String by LoggingDelegate("Guest")
}
fun main() {
    val user = User()
    println(user.username)
    user.username = "Vikash"
    println(user.username)
}