import app.cash.turbine.test
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.runTest
import kotlin.test.assertEquals

fun main() = runTest{
  val event = MutableSharedFlow<String>()
  
  launch{
    event.emit("Login")
    event.emit("Profile")
    event.emit("Logout")
  }
  event.test{
    assertEquals("Login",awaitItem())
    println("Login")
    assertEquals("Profile",awaitItem())
    println("Profile")
    assertEquals("Logout",awaitItem())
    println("Logout")
    cancelAndIgnoreRemainingEvents()
  }
  println("Passed....")
}