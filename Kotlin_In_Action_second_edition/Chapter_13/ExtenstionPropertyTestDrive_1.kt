data class Distance(val meters : Double){
  operator fun plus(other : Distance) = Distance(meters+other.meters)
  operator fun minus(other : Distance) = Distance(meters - other.meters)
  
  operator fun times(factory : Double) = Distance(meters*factory)
  
  val inMeters : Double get() = meters
  val inKelometer : Double get() = meters / 1000.0
  val inCentimeters : Double get() = meters * 100.0
  val inMiles : Double get() = meters / 1609.344
  
  override fun toString() = when{
    meters >= 1000 -> "${String.format("%.2f",inKelometer)} km "
    
    meters >= 1  -> "${String.format("%.2f",meters)} m"
    
    else    -> "${String.format("%.2f",inCentimeters)} cm "
  }
}

val Int.meters : Distance get() = Distance(this.toDouble())

val Int.kilometers : Distance get() = Distance(this.toDouble() * 1000)

val Int.centimeters : Distance get() = Distance(this.toDouble()/ 100)

val Int.miles : Distance get()  = Distance(this.toDouble() * 1609.344)


val Double.meters : Distance get() = Distance(this)
val Double.kilometers : Distance get() = Distance(this * 1000)
val Double.centimeters : Distance get() = Distance(this/ 100)

val Double.miles : Distance get()  = Distance(this * 1609.344)
fun main(){
  println("=== Int extensions ===")
  println("5.kilometers  = ${5.kilometers}")
  println("500.meters = ${500.meters}")
  println("43.miles  = ${43.miles}")
  println("150.centimeters  = ${150.centimeters}")
  
  
  println()
  
  
  println(" ==== Double extensions ====")
  println("1.5.kilometers = ${1.5.kilometers}")
  println("0.5.miles  = ${0.5.miles}")
  
  println()
  
  
  println("=== Arithmetic ===")
    val marathon = 42.kilometers + 195.meters
    println("Marathon     : $marathon")

    val shortTrip = 2.kilometers - 500.meters
    println("Short trip   : $shortTrip")

    println()

    // Real-world-like usage — config DSL style
    println("=== Config-style usage ===")
    data class RouteConfig(
        val maxRange: Distance,
        val waypointSpacing: Distance,
        val safetyBuffer: Distance
    )

    val route = RouteConfig(
        maxRange       = 500.kilometers,
        waypointSpacing = 50.kilometers,
        safetyBuffer   = 2.kilometers + 500.meters
    )

    println("Max range        : ${route.maxRange}")
    println("Waypoint spacing : ${route.waypointSpacing}")
    println("Safety buffer    : ${route.safetyBuffer}")
}