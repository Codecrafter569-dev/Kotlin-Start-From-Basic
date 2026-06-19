import kotlin.reflect.KProperty
class ValidatedString(
private var value: String = "",
private val validator: (String) -> Boolean,
private val errorMsg : String
){
  operator fun getValue(thisRef: Any?,prop: KProperty<*>) = 
  value
  operator fun setValue(thisRef: Any?, prop: KProperty<*>,newValue: String){
    if (validator(newValue)) {
        value = newValue
        println("${prop.name} set to : $newValue")
        
    }else{
      println(" ${prop.name}: $errorMsg (got: '$newValue')")
    }
  }
}
class RegistrationFrom {
  var email: String by ValidatedString(
     validator = {"@" in it && "." in it},
     errorMsg = "Invalid email formal"
  )
  var phone : String by ValidatedString(
   validator = {it.length == 10 && it.all { c -> c.isDigit()}},
   errorMsg = "Phone must be 10 digits"
  )
}
fun main() {
    val form = RegistrationFrom()
    form.email = "vikash@gmail.com"
    form.email = "noteanemail"
    form.phone = "9060858867"
    form.phone = "123"
    
}