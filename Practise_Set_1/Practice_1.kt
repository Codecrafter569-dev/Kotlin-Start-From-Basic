fun main() {
    val a = 100
    val b = 100
   // println("var = $var")
   println(a == b)
   
   val result = (10 > 5) && (8 > 5)
   println("result = $result")
   
   val result1 = (5 > 10) && ( 10 > 4)
   println("result1 = $result1")
   
   val result2 = !(20 == 20)
   println("result2 = $result2")
   
   var x = 10
   x++
   println("$x")
   x--
   println("$x")
   
   x += 20
   println(x)
   val num1 = 24
   println(num1 % 2 == 0)
   
   val result3 = 493 + 45*2
   println(result3)
   
   val text = ""
   println(text.isEmpty())
}