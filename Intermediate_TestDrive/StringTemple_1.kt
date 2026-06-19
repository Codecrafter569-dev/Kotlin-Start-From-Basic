fun main() {
    var a = 1
    println("$a")
    val s1 = "a is $a"
    println(s1)
    a = 34
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)
}