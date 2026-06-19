import app.cash.turbine.test
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import kotlin.test.assertEquals

fun main() = runTest{
  flowOf(42).test{
    assertEquals(42,awaitItem())
    awaitComplete()
  }
  println("Passed !!....")
}