class Person(val firstName: String, val lastName: String) {
    companion object
}

fun extractValue(json: String, key: String): String {
    val pattern = """"$key"\s*:\s*"([^"]+)"""".toRegex()
    return pattern.find(json)?.groupValues?.get(1) ?: ""
}

fun Person.Companion.fromJSON(json: String): Person {
    val firstName = extractValue(json, "firstName")
    val lastName = extractValue(json, "lastName")
    return Person(firstName, lastName)
}

fun main() {
    val person = Person.fromJSON("""{"firstName": "Dmitry", "lastName": "Jemerov"}""")
    println("${person.firstName}  ${person.lastName}")
}