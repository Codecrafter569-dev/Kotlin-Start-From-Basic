import kotlin.reflect.full.primaryConstructor

data class ServerConfig(
val host : String,
val port : Int,
val timeout : Int = 30
)
fun main(){
  val consts = ServerConfig::class.primaryConstructor!!
  
  val args = mutableMapOf<kotlin.reflect.KParameter,Any?>()
  
  for(param in consts.parameters){
    when(param.name){
      "host"  -> args[param] = "192.93128.93.1"
      "port"  -> args[param] = 9090
      
    }
  }
  
  val config = consts.callBy(args)
  
  println(config)
}