import kotlinx.coroutines.*
import kotlinx.coroutines.test.*
import kotlin.test.*
import kotlin.time.Duration.Companion.minutes
class SimpleCache {
    private var data: String? = null
    private var lastLoadTime: Long = -1L

    private val expiryMs = 5 * 60 * 1000L

    fun isExpired(currentTimeMs: Long): Boolean {
        if (lastLoadTime == -1L) return true
        return (currentTimeMs - lastLoadTime) > expiryMs
    }

    fun load(value: String, currentTimeMs: Long) {
        data = value
        lastLoadTime = currentTimeMs
    }

    fun get(): String? = data
}

@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runTest {
    val cache = SimpleCache()

    println("Virtual Time = $currentTime")

    // Cache is empty
    assertTrue(cache.isExpired(currentTime))

    // Load at t = 0
    cache.load("fresh data", currentTime)

    assertFalse(cache.isExpired(currentTime))
    assertEquals("fresh data", cache.get())

    println("Loaded data at $currentTime ms")

    // Advance virtual time by 4 minutes
    delay(4.minutes)

    assertFalse(cache.isExpired(currentTime))
    println("At $currentTime ms -> cache still valid")

    // Advance virtual time by 2 more minutes
    delay(2.minutes)

    assertTrue(cache.isExpired(currentTime))
    println("At $currentTime ms -> cache expired")

    println("Test passed!")
}