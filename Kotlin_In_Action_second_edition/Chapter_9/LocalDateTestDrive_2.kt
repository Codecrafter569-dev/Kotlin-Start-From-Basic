import java.time.LocalDate

fun main(){
  val now = LocalDate.now()
  println(now)
  
  val vacation = now..now.plusDays(10)
  println(now.plusWeeks(1) in vacation)
  println(now.plusWeeks(2) in vacation)
  println(now.plusDays(6) in vacation)
  
  
  val n = 9
  println(0..(n+1))
  println(1..(n+2))
  println(1..(n+10))
  (0..n).forEach{ print("$it ") }
  (0..(n+10)).forEach{print(" $it")}
}