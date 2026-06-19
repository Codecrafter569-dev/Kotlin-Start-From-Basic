fun main() {
    println(listOf(1,2,3,4).fold(0,{x,item -> x + item}))
    println(listOf(3,4,8).fold(0){x,item -> x + item})
}