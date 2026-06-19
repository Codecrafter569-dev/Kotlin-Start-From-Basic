import app.cash.turbine.test
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import kotlin.test.assertEquals

fun main() = runTest{
  flowOf("A","B","C").test{
    assertEquals("A",awaitItem())
    println("A")
    
    assertEquals("B",awaitItem())
    println("B")
    assertEquals("C",awaitItem())
    println("C")
    
    awaitComplete()
  }
  println("Passed....")
}