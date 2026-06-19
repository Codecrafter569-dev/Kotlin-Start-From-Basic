import kotlin.random.Random
fun main() {
    val secretNumber = Random.nextInt(1,101)
    var attempts = 0
    
    println("Welcome to number Guessing game")
    println("I have chosen a number between 1 and 100.")
    
    while(true){
      println("Enter your guess :")
      val guess = readLine()?.trim()
      val number = guess?.toIntOrNull()
      
      if (number == null) {
          println("Please enter a valid number.")
          continue
      }
      
      attempts++
      
      when {
        number < secretNumber -> println("Too low!")
        number > secretNumber -> println("Too high!")
        else -> {
          println("Correct! you guessed the number in $attempts attempts.")
          break
        }
      }
    }
}