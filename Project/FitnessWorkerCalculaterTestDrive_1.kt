fun main() {
    fun caloriesBurned(weightKg: Double,metValue: Double,minutes: Int): Double{
      return (metValue * weightKg * 3.5/200)*minutes
    }
    fun calculateBMI(weight: Double,heightM: Double) = weight / (heightM * heightM)
    
    fun bmiCategory(bmi: Double) = when{
      bmi < 18.5 -> "Underweight"
      bmi < 25.0 -> "Normal "
      bmi < 30.0 -> "Overweight"
      else       -> "Obese"
    }
    fun totalCalories(vararg session: Double) = session.sum()
    
    fun printWorkoutPlan(name: String,workouts: List<String>,restDays: Int = 2){
      println("\n Workout Plan for $name")
      println("Active Days: ${7 - restDays} | Rest Days: $restDays")
      workouts.forEachIndexed{i , w -> println(" Day ${i+1} : $w")}
    }
    
    val weight = 75.0
    val heightM = 1.75
    
    val runCal = caloriesBurned(weight,8.0,30)
    val swinCal = caloriesBurned(weight,6.0,45)
    val yodaCal = caloriesBurned(weight,2.5,60)
    val bmi = calculateBMI(weight,heightM)
    
    println("=== FITNESS REPORT ===")
    println("Running (30 min): ${"%.1f".format(runCal)} kcal")
    println("Swimming (45 min): ${"%.1f".format(swinCal)} kcal")
    println("Yoga (60 min) : ${"%.1f".format(yodaCal)} kcal")
    
    println("Total Week Cal :${"%.1f".format(totalCalories(runCal,swinCal,yodaCal))}kcal")
    println("BMI :${"%.1f".format(bmi)} -> ${bmiCategory(bmi)}")
    
    printWorkoutPlan(name = "Vikash",workouts = listOf("Running","Swimming","Cycling","Yoga","Weights"),
      restDays = 2
      )
    
    
    
}