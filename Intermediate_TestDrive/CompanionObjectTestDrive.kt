class BagBen {
  companion object Bonger {
      fun getBound(nTimes: Int){
        repeat(nTimes){ print("BONG ")}
      }
  }
}
fun main() {
    println(BagBen.getBound(10))
}