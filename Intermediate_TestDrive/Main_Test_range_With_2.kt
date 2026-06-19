fun main() {
    val list = listOf("a","b","c","d","e","f","g","h")
    
    if (-1 !in 0.. list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range , too")
    }
}