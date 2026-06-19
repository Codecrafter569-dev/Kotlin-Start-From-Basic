enum class Planet(val distanceFromSum : Double){
  MERCURY(0.39),
  VENUS(0.72),
  EARTH(1.00),
  MARS(1.53)
}
fun main() {
    println("Earth is ${Planet.EARTH.distanceFromSum} AU from sun")
    println("Mars is ${Planet.MARS.distanceFromSum} AU from Sum")
}