class Person {
    // All attributes stored in one map
    private val _attributes = mutableMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value  // store any key-value pair
    }

    var name: String
        get() = _attributes["name"]!!           // read from map
        set(value) { _attributes["name"] = value }  // write to map
}

fun main() {
    val p = Person()

    // Simulate loading data from JSON/API
    val data = mapOf("name" to "Seb", "company" to "JetBrains")
    for ((attrName, value) in data) {
        p.setAttribute(attrName, value)
    }

    println(p.name)       // Seb
    p.name = "Sebastian"
    println(p.name)       // Sebastian
}
