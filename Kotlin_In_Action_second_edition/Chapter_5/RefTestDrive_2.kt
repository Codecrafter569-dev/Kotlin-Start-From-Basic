class Ref<T>(var value: T) 
fun main(){
  val counter = Ref(0)
  val inc = { counter.value++ }
  
  println("Before: ${counter.value}")
  inc()
  inc()
  inc()
  inc()
  inc()
  println("After : ${counter.value}")
  
  
  var simpleCount = 0
  val do12 = { simpleCount++ }
  
  println("Before: $simpleCount")
  for( i in 1..12){
    do12()
  }
  println("After : $simpleCount")
}