import kotlin.math.sqrt
import kotlin.math.PI
import kotlin.math.pow
fun main() {
    val radius = 5.0
    val area = PI * radius.pow(2)
    val circumference = 2 * PI * radius
    val diagonal = sqrt(2.0) * radius
    
    println("Radius : $radius")
    println("Area : ${"%.2f".format(area)}")
    println("Circumference : ${"%.2f".format(circumference)}")
    println("Diagonal : ${"%.2f".format(diagonal)}")
    
}