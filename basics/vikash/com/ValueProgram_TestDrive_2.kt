fun main() {
    val pi = 4.893
    val appName : String = "MYApp"
    var counter = 0
    var message = "Start"
    
    
    counter = counter +1
    counter++
    message = "Updated"
    
    println("pi = $pi")
    println("counter = $counter")
    println("message = $message")
    println("appName = $appName")
    
    val myInt = 43
    val myDouble = 58.38
    val myString = "Hello"
    val myBool = true
    
    println("${myInt::class.simpleName}: $myInt")
    println("${myDouble::class.simpleName}: $myDouble")
    println("${myString::class.simpleName}: $myString")
    println("${myBool::class.simpleName}: $myBool")
}