fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length is ${maybeString.length}"
    } else {
      return "Empty or null string"  
    }
}
fun main() {
    var nullString: String? = null
    println(describeString(nullString))
   nullString = "Hello bro"
    println(describeString(nullString))
}