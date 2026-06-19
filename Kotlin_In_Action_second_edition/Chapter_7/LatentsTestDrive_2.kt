import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

class MyService {
    fun performAction(): String = "Action Done!"
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyTestWithLateinit {
    private lateinit var myService: MyService  // non-null, no initializer needed

    @BeforeAll fun setUp() {
        myService = MyService()  // initialized before any test runs
    }

    @Test fun testAction() {
        // Clean — no !! needed
        assertEquals("Action Done!", myService.performAction())
    }
}
