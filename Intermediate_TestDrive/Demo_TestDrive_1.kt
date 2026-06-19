class Demo{
  var count: Int =0
  set(value){
    field = if(value >= 0) value else 0
  }
}
fun main() {
    val v1 = Demo()
    v1.count = 90
    println(v1.count)
    v1.count = -24
    println(v1.count)
}