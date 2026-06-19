// If covariant types allowed input positions, this would be dangerous:
interface BadProducer<out T> {
    fun produce(): T
    // fun consume(t: T): Unit  // ❌ Kotlin blocks this — here's why:
}

// Imagine if consume() was allowed — simulation:
fun dangerousScenario() {
    // val catProducer: Producer<Cat> = ...
    // val animalProducer: Producer<Animal> = catProducer // covariance
    // animalProducer.consume(Dog("Rex"))  // Would put a Dog into a Cat producer!
    // catProducer.produce()  // Would try to return a Dog as Cat → CRASH

    println("""
        If 'out T' allowed input positions:
        1. Producer<Cat> assigned to Producer<Animal> (covariance)
        2. consume(Dog) called on Producer<Animal>
        3. Cat producer now has a Dog inside → type system broken!
        
        Kotlin prevents this by: T in 'out' position CANNOT appear as parameter type.
    """.trimIndent())
}

fun main() {
    dangerousScenario()
}
