fun main() {
    for( x in 1..<10){
      println("x is a:$x")
    }
    val a = 2
    for (x in 1..10) {
      println("$x * $a = ${x*a}") 
    }
    
    for (x in 1..20 step 2) {
        println(x)
    }
    
    for (x in 9 downTo 0 step 3 ) {
        println("x = $x")
    }
}