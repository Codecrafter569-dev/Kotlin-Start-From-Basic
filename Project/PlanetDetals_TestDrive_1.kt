fun main() {
    val planet = "Saturn"
    val distanceFromSun = 1_426_666_422L
    val diameter = 116_460
    val moons = 146
    val hasRings = true
    val surfaceTemp = -178
    val orbitalYears = 29.5
    
    val earthCompartion = diameter / 12_742.0
    
    println("""
        ╔══════════════════════════════════════╗
        ║     🪐 PLANETARY DATA REPORT         ║
        ╚══════════════════════════════════════╝
        
        Planet         : $planet
        Distance☀️     : ${"%,d".format(distanceFromSun)} km
        Diameter       : ${"%,d".format(diameter)} km
                         (${String.format("%.1f", earthCompartion)}x Earth)
        Moons          : $moons moon${if (moons > 1) "s" else ""}
        Ring System    : ${if (hasRings) "✅ Yes" else "❌ No"}
        Surface Temp   : $surfaceTemp°C
        Orbital Period : $orbitalYears Earth years
        
        Fun Fact: At $surfaceTemp°C, $planet is 
        ${Math.abs(surfaceTemp)} degrees below freezing!
    """.trimIndent())    
}