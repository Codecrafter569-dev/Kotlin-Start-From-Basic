enum class DayType{
  WEEKDAY,WEEKEND;
  
  fun message(): String {
    return when(this){
      WEEKDAY -> "This to work! "
      WEEKEND -> "Time to relax !"
    }
  }
}
fun main() {
    println(DayType.WEEKEND.message())
    println(DayType.WEEKDAY.message())
}