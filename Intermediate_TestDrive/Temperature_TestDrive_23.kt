class Temperature {
  var celsius: Double = 0.0
  var fehrenheit: Double 
  get() = celsius * 9/5 + 32
   set(value){
     celsius = (value-32)*5/9
   }
   
   var kelvin: Double 
       get() = celsius + 273.15
       set(value){
         celsius = value-273.15
       }
}
fun main() {
    val temp = Temperature()
    temp.celsius = 100.1
    println("Calsius :${temp.celsius}°C")
    println("Fehrenheit :${temp.fehrenheit}°F")
    println("kelvin : ${temp.kelvin}K")
    
    temp.fehrenheit = 90.0
    println("\nAfter setting 90.0 °F")
    println("Celsius : ${temp.celsius} °C")
    println("kelvin : ${temp.kelvin} °K")
}