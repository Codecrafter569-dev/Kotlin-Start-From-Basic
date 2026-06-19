import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds
class DownloadManager{
  private val scope = CoroutineScope(Dispatchers.Default + SupervisorJob())
  
  private var isRunning = false
  
  fun startDownloading(fileName : String){
    isRunning = true
    scope.launch{
      println("$fileName  ka download shuru/.....")
      var progress = 0
      while(progress < 100 && isRunning){
        delay(200.milliseconds)
        progress += 20
        println("$fileName : $progress% complete..")
      }
      if(progress >= 100){
        println("$fileName : download Complete !!")
      }
    }
  }
  
  fun cancalDownload(){
    isRunning = false
    scope.cancel()
    println("Saara DownloadManager cancel ho gaya !!!!")
    
  }
}
fun main(){
  val manager = DownloadManager()
  manager.startDownloading("video.mp4")
  manager.startDownloading("music.mp3")
  
  Thread.sleep(500)
  manager.cancalDownload()
  Thread.sleep(300)
  println("Program exits ....")
}