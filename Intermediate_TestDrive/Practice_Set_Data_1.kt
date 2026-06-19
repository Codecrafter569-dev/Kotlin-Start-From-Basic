val Double.asMiles: Double
   get() = this *  0.621371
fun main() {
    val distanceKm = 5.0
    println("$distanceKm km is ${distanceKm.asMiles} miles")
    
    val marathonDistance = 42.195
    println("$marathonDistance km is ${marathonDistance.asMiles} miles")
}