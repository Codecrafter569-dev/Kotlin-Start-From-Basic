class StrictProcess<T : Any>{
  fun process(value : T){
    println(value.hashCode())
  }

  }

fun main(){
  val sp = StrictProcess<String>()
  sp.process("Kotlin")
}