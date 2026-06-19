fun main() {
    val names = listOf("Vikash kumar","Shahil kumar","Aashis kumar","Yash kumar")
    
    println("This is the first item of list: ${names[2]}")
    println("This is the the last item of list:${names.last()}")
    println("This is the first item using method :${names.first()}")
    println("Total length :${names.count()}")
    
    
    val numbers: MutableList<Int> = mutableListOf(12,45,90,88,56,33,56,22,1,3)
    
    println(12 in numbers)
    println(100 in numbers)
    numbers.add(100)
    println(100 in numbers)
    numbers.remove(100)
   println(100 in numbers)
}