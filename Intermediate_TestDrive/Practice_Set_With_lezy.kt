fun checkAppSever(): Boolean {
  println("Performing application server health check...")
  return true
}
fun checkDatabace(): Boolean {
  println("Performing databace health check ....")
  return false
}
fun main() {
    val isAppServerHealthy by lazy { checkAppSever()}
    val isDatabaseHealthy by lazy { checkDatabace()}
    
    when {
     isAppServerHealthy -> println("Application server is online and healthy")
      isDatabaseHealthy -> println("Databace is healthy")
      
      else -> println("System is offline")
    }
}