import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*
import app.cash.turbine.*   // Turbine import
import kotlin.test.*
fun main() = runTest{
  flowOf(1,23,45).test{
    assertEquals(1,awaitItem())
    assertEquals(23,awaitItem())
    assertEquals(45,awaitItem())
    awaitComplete()
  }
}