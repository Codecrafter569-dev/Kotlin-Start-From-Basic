fun repeat(times:Int,action: (Int) -> Unit){
  for(i in 0 until times) action(i)
}
fun main(){
  repeat(4) { index -> println("Steps $index") }
}