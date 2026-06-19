var storedCallback: (() -> Unit)? = null

inline fun processWithCallabck(
inlined : () -> Unit,
noinline stored: () -> Unit,

){
  inlined()
  storedCallback = stored
}
fun main(){
  processWithCallabck(
  inlined  = { println("I am inlined!")},
  stored = { println(" I am stored and called later...")}
  )
  
  println("----- callling stored callback ----- ")
  storedCallback?.invoke()
}