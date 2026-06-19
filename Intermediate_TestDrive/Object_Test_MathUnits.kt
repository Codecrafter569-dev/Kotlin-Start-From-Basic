object MathUnits{
  fun add(a: Int,b: Int) = a+ b
  fun sub(a:Int , b: Int) = a-b
  fun multi(a:Int, b:Int) = a*b
  fun devide(a: Int,b:Int) : Int{
    if (b == 0) {
        println("Can not devide by zero.")
        return 0
    }
      return a/b
  }
}
fun main() {
    println(MathUnits.add(34,90))
    println(MathUnits.sub(90,14))
    println(MathUnits.multi(10,89))
    println(MathUnits.devide(90,83))
}