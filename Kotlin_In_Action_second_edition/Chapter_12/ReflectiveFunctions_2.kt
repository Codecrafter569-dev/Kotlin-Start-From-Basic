import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

data class Laptop(
    val brand: String,
    val ram: Int,
    val price: Double,
    val isAvailable: Boolean
)

// Prints every property name and value for ANY object
fun printAllProperties(obj: Any) {

    val kClass = obj::class

    println("[ ${kClass.simpleName} ]")

    for (prop in kClass.memberProperties) {

        // Cast needed because memberProperties uses out-projection
        val property = prop as KProperty1<Any, *>

        val value = property.get(obj)

        println("${property.name.padEnd(15)} = $value")
    }
}

fun main() {

    val laptop = Laptop(
        "Dell",
        16,
        999.99,
        true
    )

    printAllProperties(laptop)

    println()

    data class Student(
        val name: String,
        val grade: Int,
        val passed: Boolean
    )

    val student = Student(
        "Vikash",
        95,
        true
    )

    printAllProperties(student)
}