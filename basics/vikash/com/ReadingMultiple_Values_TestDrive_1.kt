
fun main() {
   println("Enter a 3 number and seprate with space :") 
   
   val line = readln()
   val parts = line.trim().split(" ")
   val a = parts[0].toInt()
   val b = parts[1].toInt()
   val c = parts[2].toInt()
   
   println("Numbers : $a, $b, $c")
   println("Sum: ${a+b+c}")
   println("Average: ${"%.2f".format((a+b+c)/3.0)}")
   println("Max : ${maxOf(a,b,c)}")
   println("Min: ${minOf(a,b,c)}")
}