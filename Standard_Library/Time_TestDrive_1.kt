import kotlin.time.Duration
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes
fun main() {
    val thiryMinutes: Duration = 30.minutes
    val helfHours: Duration = 0.5.hours
    println(thiryMinutes)
    println(helfHours)
    println(thiryMinutes == helfHours)
}