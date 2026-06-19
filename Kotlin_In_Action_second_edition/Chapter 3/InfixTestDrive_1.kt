infix fun Any.to(other: Any) = Pair(this,other)
fun main() {
    val(number,name) = 1 to "one"
    val(num,na) = "Vikash" to 1242
    println(number)
    println(name)
    println(num)
    println(na)
}