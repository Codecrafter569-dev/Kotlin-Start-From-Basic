fun findFirstEven(numbers : List<Int>): Int?{
  numbers.forEach{ num -> 
  if(num % 2 == 0){
    println("Found even : $num")
    return num
  }
  }
  
  println("No Even Found")
  return null
}
fun main(){
  val result = findFirstEven(listOf(1,5,3,11,17,19,21,23,8))
  println("Result : $result")
}