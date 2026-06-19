//import java.util.Scanner;
fun main() {
    println("Simple Calculater")
    println("Enter first number.")
    val num1 = readLine()!!.toDouble()
    //val num1 = 
   // println("You are  enter a number this $num1")
    println("Enter operator(+,-,*,/):")
    val operator = readLine()!!
    println("Enter second number:")
    val num2 = readLine()!!.toDouble()
    
    val result = when(operator){
      "+" -> num1 + num2
      "-" -> num1 - num2
      "*" -> num1 - num2
      "/" -> {
        if(num2 != 0.0) num1 / num2
        else {
          println("Cannot divide by zero")
          return
        }
      }
      else -> {
        println("Invalid operator")
        return
      }
    }
    println("result = $result")
}