fun addValidNumber(numbers: List<Int?>){
  var sumOfValidNumbers = 0;
  var invalidNumbers = 0;
  
  for(number in numbers){
    if(number != null){
      sumOfValidNumbers += number;
    }else{
      invalidNumbers++
    }
  }
  println("The sum Of all Valid : ${sumOfValidNumbers}")
  println("Count the Numbers of InvalidNumbers : ${invalidNumbers}")
}
fun addValidNumbersClean(numbers : List<Int?>){
  val validNumbers = numbers.filterNotNull()
  println("Sum of valid Numbers : ${validNumbers.sum()}")
  println("Invalid Numbers : ${numbers.size - validNumbers.size}")
}
fun main(){
  val numbers = listOf(1,null,34,null,30,null,22,null,10)
  addValidNumbersClean(numbers)
  println("------")
  addValidNumber(numbers)
}

