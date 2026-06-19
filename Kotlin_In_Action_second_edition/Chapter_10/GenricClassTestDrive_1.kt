class Box<T>(val v : T){
  fun describe(): String = "Box contians: $v (${v!!::class.simpleName})"
}

fun main(){
  val intBox = Box(29)
  val strBox = Box("Kotlin")
  val doubleBox = Box(992.93)
  println(intBox.describe())
  println(strBox.describe())
  println(doubleBox.describe())
}