fun main() {
    val userIsLoggedIn = true
    val hasSesstion = true
    
    val can = userIsLoggedIn.takeIf{ hasSesstion}
    
    println(can ?: "Access denied")
    
}