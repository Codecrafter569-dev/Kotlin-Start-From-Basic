fun interface Observer {
    fun onChange(name: String, oldValue: Any?, newValue: Any?)
}

open class Observable {

    val observers = mutableListOf<Observer>()

    fun notifyObserver(
        propName: String,
        oldValue: Any?,
        newValue: Any?
    ) {
        for (obs in observers) {
            obs.onChange(propName, oldValue, newValue)
        }
    }
}

class Person(
    val name: String,
    age: Int,
    salary: Int
) : Observable() {

    var age: Int = age
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObserver("age", oldValue, newValue)
        }

    var salary: Int = salary
        set(newValue) {
            val oldValue = field
            field = newValue
            notifyObserver("salary", oldValue, newValue)
        }
}

fun main() {

    val p = Person("Vikash", 28, 1000)

    p.observers += Observer { propName, oldValue, newValue ->
        println("$propName changed from $oldValue to $newValue")
    }

    p.age = 29
    p.salary = 1500
}