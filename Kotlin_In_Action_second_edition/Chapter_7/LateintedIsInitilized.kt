class Config{
  lateinit var apiKey: String
  
  fun isReady(): Boolean = ::apiKey.isInitialized
  
  fun connect(){
    if(::apiKey.isInitialized){
      println("Connecting with Key: $apiKey")
    }else{
      println("ERROR: apiKey not Initialized")
    }
  }
}
fun main(){
  val config = Config()
  config.connect()
  
  config.apiKey = "abc-123467"
  config.connect()
  
  println(config.isReady())
}