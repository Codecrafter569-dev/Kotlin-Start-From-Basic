fun postponeComputation(delary:Int,computation:Runnable){
  println("Will Run after ${delary}ms.")
  computation.run()
}


fun runWithAnonymouseObject(){
  postponeComputation(1000,object : Runnable{
    override fun run(){
      println(" Running via anonymouse object ")
    }
  })
}

fun runWithNonCapturingLambda(){
  postponeComputation(1000){
    println(" Running via Non-capturing lambda ...")
  }
}
fun createAllDoneRunnable(): Runnable {
  return Runnable { println("All done! ")
}
}
fun handleComputation(id: String){
  postponeComputation(1000){
    println(" Computation for id = $id")
  }
}


fun main(){
  println(" --- Anonymouse Object ---")
  runWithAnonymouseObject()
  
  println(" --- Non-capturing lambda (single instance resused) --- ")
  runWithNonCapturingLambda()
  runWithNonCapturingLambda()
  
  println("--- Capturing lambda (new instance each call) ---")
  handleComputation("req-001")
  handleComputation("req-002")
  
  println("--- Explicit SAM constructor ---")
  createAllDoneRunnable().run()
}