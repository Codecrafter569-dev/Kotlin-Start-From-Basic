fun main() {
    for (number in 1..10) {
      println(number)  
    }
    println("\n")
    
    for (number in 30 downTo 1) {
        println(number)
    }
    for (a in 'a'..'t') {
        println(a)
    }
    for (c in 'a'..<'z') {
        println(c)
    }
    for (d in 0..100 step 5) {
        print("$d ")
    }
    
}