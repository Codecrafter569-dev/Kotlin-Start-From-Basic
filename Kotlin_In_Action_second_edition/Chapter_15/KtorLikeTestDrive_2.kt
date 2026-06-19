import kotlinx.coroutines.*
fun main(){
  runBlocking{
   val appScope = CoroutineScope(Dispatchers.Default + SupervisorJob()) 
   
   println(" ===== Request Aaaya =====")
   
   val requestScope =CoroutineScope(Dispatchers.Default + SupervisorJob())
   
   requestScope.launch{
     println("Request Task : Background work was start ..")
     delay(2000)
     println("Request Task : Work over...")
   }
   
   appScope.launch{
     println("App Task : Long-running work start ...")
     delay(2000)
     println("App Task : Work was Done ...")
     
   }
   
   delay(500)
   println(" ==== Client disConnect ho gaya !! Request cancel ...")
   requestScope.cancel()
   
   delay(2000)
   println(" ==== App level tasks continue karte raha ====")
   appScope.cancel()
  }
}