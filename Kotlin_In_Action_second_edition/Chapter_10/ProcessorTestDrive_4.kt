class Processor<T>{
  fun process(value: T){
    value?.hashCode()
  }
}
fun  main(){
  val p2  = Processor<String?>()
  p2.process(null)
  p2.process("String value testDrive ...")
}