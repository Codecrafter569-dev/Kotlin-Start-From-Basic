fun main() {
    println("Simple Calculater")
    println("Enter a first number and if you want to exit then enter a exit in the place of first numner .")
    
    while(true){
    println("Enter a first value :")
    val input1 = readLine()!!
    if(input1.lowercase() == "e"){
      break
    }
    val num1 = input1.toDouble()
    
    println("Enter a any operator(+,-,*,/) :")
    val operator = readLine()!!
    
    println("Enter a second number to do that :")
    val num2 = readLine()!!.toDouble()
    
    val result = when(operator){
      "+" -> num1+num2
      "-" -> num1 - num2
      "*" -> num1 * num2
      "/" -> {
        if(num2 != 0.0) num1/num2
        else{
          println("Cannot divide by zero :")
          continue
        }
      }
      else -> {
        println("Invalid input")
        continue
      }
    }
    println("result = $result")
    }
    
    println("Calculater closed ....")
}