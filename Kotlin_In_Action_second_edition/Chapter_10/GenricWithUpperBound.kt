fun <T : Comparable<T>> max(first : T,second : T): T{
  return if(first > second) first else second
}

fun main(){
  println(max("Kotlin","java"))
  println(max(30,50))
  println(max(90.9,34.2))
}