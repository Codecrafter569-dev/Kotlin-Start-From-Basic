fun main() {
    val readOnlyFruit = setOf("apple","banana","cherry","cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple","cherry","banana","cherry")
    println(readOnlyFruit)
    println(fruit)
    
    println("The has a number of item is :${fruit.count()}")
    
    println("banana" in fruit)
    
    
    val values: MutableSet<Double> = mutableSetOf(23.90,893.343,8383.583,239.84)
    println(values)
    values.add(8.90)
    println(values)
    values.remove(23.90)
    println(values)
}