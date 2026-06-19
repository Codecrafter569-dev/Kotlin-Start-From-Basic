fun main() {
    val list = listOf("23","90","34","2","33")
    for((index,element) in list.withIndex()){
      println("$index : $element")
    }
}