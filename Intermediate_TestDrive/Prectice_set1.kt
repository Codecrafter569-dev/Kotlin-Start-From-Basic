fun fetch(callback: StringBuilder.() -> Unit){
  val builder = StringBuilder("Data received")
  builder.callback()
}
fun main() {
    fetch {
      append(" - Processed.")
      println(this.toString())
    }
}