data class Duration(val totalSeconds: Long){
  operator fun plus(other : Duration)= Duration(totalSeconds+other.totalSeconds)
  
  operator fun minus(other : Duration) = Duration(totalSeconds - other.totalSeconds)
  
  operator fun times(factor : Int) = Duration(totalSeconds * factor)
  
  val inSeconds get() = totalSeconds
  val inMinutes get() = totalSeconds / 60
  val inHours get() = totalSeconds / 3600
  val inDays get() = totalSeconds / 86400
  
  override fun toString(): String{
    val d = totalSeconds / 86400
    val h = (totalSeconds % 86400) / 3600
    val m = (totalSeconds % 3600) / 60
    val s = totalSeconds % 60
    
    return buildString{
      if(d > 0)  append("${d} d")
      if(h > 0) append("${h} h")
      if(m > 0) append("${m} m")
      if(s > 0) append("${s} s")
    }.trim()
  }
}

val Int.seconds : Duration get() = Duration(this.toLong())
val Int.minutes : Duration get() = Duration(this.toLong()*60)
val Int.hours : Duration get() = Duration(this.toLong()*3600)

val Int.days : Duration get() = Duration(this.toLong()*86400)

val Int.weeks : Duration get() = Duration(this.toLong()*7*86400)

val Int.fortnight: Duration get() = Duration(this.toLong()*14*86400)


fun main(){
 val oneDay = 1.days
 val twoHours = 2.hours
 val thirtyMins = 30.minutes
 val oneWeek =  1.weeks
 val fortnight = 1.fortnight
 
    println("1.days       = $oneDay")
    println("2.hours      = $twoHours")
    println("30.minutes   = $thirtyMins")
    println("1.weeks      = $oneWeek")
    println("1.fortnights = $fortnight")
    
    
    println()
    
    
    val deadline = 2.weeks + 3.days + 4.hours
    println("Deadline : $deadline")
    
    val sprint = 2.weeks - 1.days
    
    println("Sprint : $sprint")
    
    val trippled = 3.days * 3
    println("3.DAYS*3 : $trippled")
    
    println()
    
    
        val sessionTimeout = 30.minutes
    val tokenExpiry    = 7.days
    val cacheExpiry    = 2.hours + 30.minutes

    println("Session timeout : ${sessionTimeout.inSeconds}s")
    println("Token expiry    : ${tokenExpiry.inDays}d")
    println("Cache expiry    : ${cacheExpiry.inMinutes}m")
    
    }