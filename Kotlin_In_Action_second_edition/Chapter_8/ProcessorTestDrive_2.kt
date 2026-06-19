interface Processor<T>{
  fun process(): T
}

class NoResultDone: Processor<Unit>{
  override fun process(){
    println("Processing ... done!")
  }
}

class StringBulider: Processor<String>{
  override fun process() : String {
    return "Result Ready to Do some work..."
  }
}
fun main(){

val p1 = NoResultDone()
val p2 = StringBulider()
  p1.process()
  
  println(p2.process())
}