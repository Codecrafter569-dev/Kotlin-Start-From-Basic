fun main() {
    println("Enter Principal Amount:")
    val p = readLine()!!.toDouble()
    
    println("Enter Rate of Interest :")
    val r = readLine()!!.toDouble()
    
    println("Enter Time in years:")
    val t = readLine()!!.toDouble()
    
    val si = (p * r * t) / 100
    
    println("Simple Interest = $si")
    println("Total Amount :${p+si}")
}
