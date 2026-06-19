enum class Color{
  RED,GREEN,BLUE,YELLOW,WHITE,INDIGO,ORANGE
}
fun meanOfColor(co : Color) =
   when(co){
     Color.RED -> "High power"
     Color.GREEN -> "Speed"
     Color.BLUE  -> "Need to drink a water"
     Color.YELLOW -> "slowness effect "
     Color.WHITE -> "Imortal power"
     Color.INDIGO -> "Blue Color is Good for a maskito"
     Color.ORANGE -> "Orange juce is best for a health"
   }
fun main() {
    println(meanOfColor(Color.RED))
    println(meanOfColor(Color.INDIGO))
    println(meanOfColor(Color.ORANGE))
    println(meanOfColor(Color.WHITE))
    println(meanOfColor(Color.YELLOW))
    println(meanOfColor(Color.BLUE))
    
    
}