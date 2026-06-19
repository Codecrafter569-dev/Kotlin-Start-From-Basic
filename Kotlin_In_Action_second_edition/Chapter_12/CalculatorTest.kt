import kotlin.test.Test

// ✅ CORRECT: const val is a compile-time constant
const val TEST_TIMEOUT = 10L

// ❌ WRONG: regular val is NOT a compile-time constant
// val WRONG_TIMEOUT = 10L  --> causes compile error in @Timeout(WRONG_TIMEOUT)

class TimedTest {
    @Test
    // @Timeout(TEST_TIMEOUT)  // Works fine because TEST_TIMEOUT is const
    fun testMethod() {
        val result = (2 + 2)
        println("Result: \$result")  // 4
    }

    fun main() {
        println("const val TEST_TIMEOUT = \$TEST_TIMEOUT")
        testMethod()
    }
}

fun main() {
    TimedTest().main()
}
