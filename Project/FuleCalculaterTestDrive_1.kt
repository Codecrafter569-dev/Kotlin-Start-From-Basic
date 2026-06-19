fun main() {
    val missionName = "Apollo-X"
    val rocketMass = 2_950_000L
    
    val fuelDensity = 0.81f
    val targetPlanet = "Mars"
    
    
    var fuelReamining = 1_500_000.0
    var thrustLevel = 85
    var isLaunched = false
    
    println("Mission: $missionName  -> $targetPlanet")
    println("Rocket Mass : ${rocketMass}kg")
    println("FuelDensity :${fuelDensity}kg/L")
    println("Initial Fuel :${fuelReamining}L")
    
    isLaunched = true
    fuelReamining -= 300_000.0
    thrustLevel = 100
    
    println("\n ---- POST LAUNCH ---")
    println("Launched  : $isLaunched")
    println("Fuel left :${fuelReamining}L")
    println("Thruest Level :${thrustLevel}%")
    
    fuelReamining -= 200_000.0
    thrustLevel = 40
    
    println("\n --- CRUISE PHASE ---")
    println("Fuel Left :${fuelReamining}L")
    println("Thruest Level  :${thrustLevel}%")
    
}