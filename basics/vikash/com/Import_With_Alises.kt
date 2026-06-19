import java.util.Date as JavaDate
import java.sql.Date as SqlDate
fun main() {
    val javaDate = JavaDate()
    val sqlDate = SqlDate(System.currentTimeMillis())
    val list = listOf(1,2,3)
    val range = 1..10
    val text = "Hello".uppercase()
    println("Java Date : $javaDate")
    println("SQL Date : $sqlDate")
    
    println(text)
    println(list)
    println(range.toList())
}