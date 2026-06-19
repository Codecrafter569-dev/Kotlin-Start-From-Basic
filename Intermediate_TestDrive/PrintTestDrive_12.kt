fun printObjectType(obj: Any){
  when(obj){
    is Int -> println("The value is a Integer: $obj type..")
    !is Double -> println("The value:$obj, is not a Double type...")
    is Double -> println("The value : $obj, is Double")
    else -> println("Unknown type...")
  }
}
fun main() {
    val myInt = 34
    val myDouble = 8.90
    val list1 = listOf(1,2,4,5)
    
    printObjectType(myDouble)
    printObjectType(myInt)
    printObjectType(list1)
}