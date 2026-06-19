import kotlin.test.Test
import kotlin.test.assertTrue

// ✅ MUST be const val — annotation arguments are compile-time constants
const val TEST_TIMEOUT = 10L

class MyTest {

    // @Test tells the test framework: "Run this as a test case"
    @Test
    fun testTrue() {
        // assertTrue checks the condition is true at runtime
        assertTrue(1 + 1 == 2)
        println("testTrue passed: 1 + 1 == 2 is ${1 + 1 == 2}")
    }
}

fun main() {
    val test = MyTest()
    test.testTrue()

    // Demonstrating that const val is required for annotation arguments
    println("TEST_TIMEOUT value: $TEST_TIMEOUT")
    println("Annotations are evaluated at COMPILE TIME — only const val works!")

    // This shows what happens conceptually with @Timeout(TEST_TIMEOUT)
    // The compiler reads TEST_TIMEOUT directly as the literal 10L
    println("@Timeout would use: ${TEST_TIMEOUT}L ms")
}