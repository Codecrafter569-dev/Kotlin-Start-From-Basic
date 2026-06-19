import app.cash.turbine.test
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
fun main() = runTest{
  flowOf(1,2,3,4,5).test{
      println(awaitItem())
      println(awaitItem())
      println(awaitItem())
      println(awaitItem())
     println(awaitItem())
    awaitComplete()
  }
}