fun printOddNumbers(numbers: List<Int>){
  numbers.forEach skip@{ num -> if(num % 2 == 0) return@skip
  println("Odd : $num")
  }
}
fun main(){
  printOddNumbers(listOf(1,2,3,4,5,6,7,9,0,10,22,24,89))
}