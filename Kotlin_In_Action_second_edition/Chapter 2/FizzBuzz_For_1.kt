fun fizzBuzz(i: Int): String = when{
  i % 15 == 0 -> "Hello bro"
  i % 3 == 0  -> "Fizz"
  i % 5 == 0  -> "Hey Nandni"
  else  -> "$i"
}

fun main() {
    for( i in 1..100){
      println(fizzBuzz(i))
    }
    println()
    
    for( i in 100 downTo 1 step 2){
      println(fizzBuzz(i))
    }
}