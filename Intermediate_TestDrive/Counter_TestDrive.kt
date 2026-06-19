object Counter {
  var count =0
  fun increase(){
    count++
  }
}
fun main() {
    Counter.increase()
    Counter.increase()
    Counter.increase()
    println(Counter.count)
}