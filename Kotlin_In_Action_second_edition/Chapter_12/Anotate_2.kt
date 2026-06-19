@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class Timeout(val seconds : Long)

const val TEST_TIMEOUT = 10L

class MyTest{
  @Timeout(TEST_TIMEOUT)
  fun testMethod(){
    println("Test is Running...")
  }
}

fun main(){
  MyTest().testMethod()
}