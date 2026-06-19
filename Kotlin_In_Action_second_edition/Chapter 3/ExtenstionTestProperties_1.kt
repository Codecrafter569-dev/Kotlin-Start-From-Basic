val String.lastChar: Char 
     get() = get(length-1)

var StringBuilder.lastChar: Char 
 get() = get(length-1)
 set(val1){
   setCharAt(length-1,val1)
 }
fun main() {
     println("Vikash Kumar".lastChar)
    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)
    
    sb.lastChar = '!'
    println(sb)
}