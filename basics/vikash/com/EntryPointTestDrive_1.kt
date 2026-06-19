fun sqaure(n: Int) = n*n
fun cube(n: Int) = n*n*n

fun main() {

println("Square of 12 = ${sqaure(12)}")
println("Cube of 22 = ${cube(22)}")
    val list = listOf("Vikash","Aasis","Shahil","Sumit")
    if (list.isEmpty()) {
        println("Koi argument nahi diya!")
    }else{
      for (item in list) {
          println(item)
      }
    }
}