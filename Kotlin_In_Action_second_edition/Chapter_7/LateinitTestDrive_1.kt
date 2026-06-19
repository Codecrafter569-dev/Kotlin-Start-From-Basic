import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class MyService {
    fun performAction(): String = "Action Done!"
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyTestWithoutLateinit {
    private var myService: MyService? = null  // forced to be nullable

    @BeforeAll fun setUp() {
        myService = MyService()
    }

    @Test fun testAction() {
        // Must use !! every time — ugly and risky
        assertEquals("Action Done!", myService!!.performAction())
    }
}
fun main(){
  val p1 = MyTestWithoutLateinit()
  
  p1.testAction()
}