@file:OptIn(ExperimentalCoroutinesApi::class)

import app.cash.turbine.test
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import kotlin.test.assertEquals
import kotlin.time.Duration.Companion.seconds

fun main() = runTest {
    val numbers = flow {
        emit(1)
        delay(1.seconds)
        emit(2)
        delay(2.seconds)
        emit(3)
        delay(3.seconds)
        emit(4)
    }

    numbers.test {
        assertEquals(1, awaitItem())
        println("time = ${testScheduler.currentTime} ms")

        assertEquals(2, awaitItem())
        println("time = ${testScheduler.currentTime} ms")

        assertEquals(3, awaitItem())
        println("time = ${testScheduler.currentTime} ms")

        assertEquals(4, awaitItem())
        println("time = ${testScheduler.currentTime} ms")

        awaitComplete()
    }
}