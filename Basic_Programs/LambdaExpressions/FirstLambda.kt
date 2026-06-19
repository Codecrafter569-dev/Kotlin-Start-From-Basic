fun upperString(text:String): String{
    return text.uppercase();
}
fun main() {
    println(upperString("Hello"))
    println(upperString("Vikash Kumar"))
    val upperCaseString = {text: String -> text.uppercase()}
    val numValue = { num: Int -> num+483*12 }
    println(upperCaseString("Hello"))
    println(numValue(45))
}