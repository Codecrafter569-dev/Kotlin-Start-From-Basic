import kotlinx.datetime.*
fun main() {
    val now = Clock.System.now()
    println("Current instant: $now")
    
  //  val zone = TimeZone.of("India")
//    val localDataTime = now.toLocalDataTime(zone)
//    println("Local data-time in NY : $localDataTime")
}