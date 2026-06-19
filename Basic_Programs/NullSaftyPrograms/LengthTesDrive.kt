fun lengthString(maybeString: String?) : Int? = maybeString?.length
fun main() {
    val nullString: String? = null
    println(lengthString(nullString))
    //this is a Elvis operator
    println(nullString?.length?:0)
}