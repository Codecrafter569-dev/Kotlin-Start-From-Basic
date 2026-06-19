class ReportConfig{
  var title = "Untitled"
  var author = "Unknown"
  var maxRows = 100
  var showDate = true
  
  
  operator fun invoke(block : ReportConfig.() -> Unit){
    block()
  }
  override fun toString()  = "Report[title='$title', author='$author', maxRows=$maxRows, showDate=$showDate]"
}

class ReportRunner(val config : ReportConfig){
  fun run(){
    println("Running : $config")
    
    println(" --> Fetching up to ${config.maxRows}")
    
    if(config.showDate) println("  -> Date : 2026-05-2024")
    
    println(" ---.> Done \n")
  }
}
fun main(){
  val config  = ReportConfig()
  
  config.title = "Sales Report"
  config.author  = "Vikash"
  config.maxRows = 60
  
  println("After direct config :")
  println(config)
  
  
  println()
  
  val runner = ReportRunner(config)
  runner.run()
  
  
  val quickConfig = ReportConfig().apply{
    title  = " Quick Report"
    maxRows = 20
    
  }
  
  ReportRunner(quickConfig).run()
  
}