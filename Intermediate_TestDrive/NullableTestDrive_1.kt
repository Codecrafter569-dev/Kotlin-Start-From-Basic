
fun main() {
    val userName: String? = "Vikash Kumar"
    println(userName)
    
    val v1 : String? = null
    println(v1?.length)
    
    val city: String? = null
     
     if (city != null) {
         println(city.uppercase())
     }else{
       println("City is missing..")
     }
     
     println(userName!!.uppercase())
}