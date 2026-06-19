fun getParsetage(number: Int): Int{
  return if(number in 1..100){
    number
  }else{
    throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
  }
}
fun main() {
    println(getParsetage(100))
    
    println(getParsetage(90))
    
    println(getParsetage(200))
}