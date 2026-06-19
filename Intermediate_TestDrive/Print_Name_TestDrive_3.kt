fun printName(name: String?){
  if (name == null) {
      return
  }
  println("Hello, $name")
}
fun main() {
  // if (name == null) {
//       return
//   }
//   println("Hello, $name")

printName("Vikash Kumar")
printName(null)
}