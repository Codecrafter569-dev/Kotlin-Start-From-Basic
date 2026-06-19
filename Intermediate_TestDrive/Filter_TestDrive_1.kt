
fun main() {
    val email: List<String?> = listOf("vi@gmail.com","123@gmail.com",null,"pop@gmail.com",null,"bro@gmail.com")
    
    val validEmails = email.filterNotNull()
    println(validEmails)
    
    val serverConfig = mapOf(
    "appConfig.json" to "App Configuration",
    "dbConfig.json" to "Database Configuration"
    )
    
    val requestedFile = "appConfig.json"
    val configFiles = listOfNotNull(serverConfig[requestedFile])
    println(configFiles)
}