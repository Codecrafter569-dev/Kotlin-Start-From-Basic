import java.util.Scanner
fun main() {
    println("Hello world")
    println("My name is viaksh")
    println("Line 1")
    println("Line 2")
    println("Line 3")
    println("Line 4")
    
    val age = 484;
    println("This is my current age :$age")
    var score = 20
    println(score)
    score = 584
    println(score)
    val a = 48;
    val b = 40;
    println(a+b)
    println(10-3)
    println(20*45)
    println(20/5)
    println(10 % 3)
    
    val scanner = Scanner(System.`in`)
    println("Enter your favratie number : ")
     val num = scanner.nextInt();
    println("This is your favratie number : $num")
    
    var a1 = 10
    var b1 = 20
    println("This a:$a1 , This b:$b1")
    val temp = a1
    a1 = b1
    b1 = temp
  println("This a:$a1 , This b:$b1")

val length = 20
val width = 45

println(length*width)

println(a*a)

println(num * num * num)


val p = 1000
val r = 5
val t = 2

val si = (p*r*t)/100
println(si)

val cal = 59
val farenhite = (cal* 9/5)+32
println("cal = $cal")
println(farenhite)
println("farenhite = $farenhite")
val age1: Int = 20
val price: Double = 99.99
val letter: Char = 'V'
val name:String ="Kotlin"
val isActive: Boolean = true
println(age1)
println("price = $price")
println("letter = $letter")
println("name = $name")
println("isActive = $isActive")


val result = num.toDouble();
println("result = $result")

val text = "100"
val num1 = text.toInt()
println("text = $text")
println("num1 = $num1")

val first = "Vikash"
val second = "Kumar"
println("first = $first")
println("second = $second")

val name2 = "Vikash"
val age3 = 34
println("Name is $name2 and age is $age3")
println("Name length is ${name2.length}")
println(name2.uppercase())

val name3 = "KOTLIN"
println(name3.lowercase())

println(age3 > age1)
}