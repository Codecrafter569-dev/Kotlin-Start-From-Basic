import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

open class Observable {
    val observers = mutableListOf<Observer>()
    fun notifyObservers(propName: String, oldValue: Any?, newValue: Any?) {
        for (obs in observers) obs.onChange(propName, oldValue, newValue)
    }
}

class Person(val name: String, age: Int, salary: Int) : Observable() {

    // onChange lambda: called every time the property changes
    private val onChange = { property: KProperty<*>, oldValue: Any?, newValue: Any? ->
        notifyObservers(property.name, oldValue, newValue)
    }

    // Delegates.observable(initialValue, onChange)
    var age by Delegates.observable(age, onChange)
    var salary by Delegates.observable(salary, onChange)
}

fun main() {
    val p = Person("Seb", 28, 1000)

    p.observers += Observer { propName, oldValue, newValue ->
        println("CHANGED: $propName = $oldValue → $newValue")
    }

    p.age = 30
    p.salary = 2000
    p.age = 31
}
