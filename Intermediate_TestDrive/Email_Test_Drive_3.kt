fun main() {
    val emails : List<String?> = listOf("a@gmail.com",null,"b@gmail.com",null)
    
    val validCount = emails.filterNotNull().size
    println(validCount)
}