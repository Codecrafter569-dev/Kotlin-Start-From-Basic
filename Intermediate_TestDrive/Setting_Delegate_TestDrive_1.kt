import kotlin.reflect.KProperty
class SettingDelegate<T>(private var default: T){
  private val settings = mutableMapOf<String,T>()
  
  operator fun getValue(thisRef: Any?,property: KProperty<*>): T = settings.getOrDefault(property.name,default)
  
  operator fun setValue(thisRef: Any?,property: KProperty<*>,value: T){
    settings[property.name] = value
    println("Saved: ${property.name} = $value")
  }
}

class AppSettings{
  var darkMode: Boolean by SettingDelegate(false)
  var fontSize: Int by SettingDelegate(16)
  var language: String by SettingDelegate("English")
}
fun main() {
    val setting = AppSettings()
    println("Dark Mode: ${setting.darkMode}")
    setting.darkMode = true
    setting.fontSize = 20
    println("Dark Mode: ${setting.darkMode}, Font: ${setting.fontSize}")
}