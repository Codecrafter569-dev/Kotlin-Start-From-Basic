fun main() {
    val readOnlyShapes = listOf("triangle","square","circle")
    val radious = listOf(838.73,89.90,8.90,23.90,12.33)
    println(readOnlyShapes)
    println(radious)
    
    val shapes: MutableList<String> = mutableListOf("triangle","square","circle","ractangle")
    println(shapes)
    val shapedLockes: List<String> = shapes
    
    println(shapedLockes)
  //  val x: Int = "Helllo"
    
}