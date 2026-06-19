import kotlin.reflect.KProperty

// A delegate that validates the property name at creation time
class ValidatedDelegate(private var value: String) {

    // Called at class instantiation, before any get/set
    operator fun provideDelegate(thisRef: Any?, prop: KProperty<*>): ValidatedDelegate {
        if (prop.name == "password") {
            throw IllegalArgumentException("Cannot delegate 'password' property!")
        }
        println("Delegate provided for: \${prop.name}")
        return this  // return the actual delegate to use
    }

    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String = value
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: String) {
        value = newValue
    }
}

class User {
    var username: String by ValidatedDelegate("guest")
    // var password: String by ValidatedDelegate("secret") ← would throw!
}

fun main() {
    val u = User()                       // provideDelegate called here
    println(u.username)                  // guest
    u.username = "vikash"
    println(u.username)                  // vikash
}
