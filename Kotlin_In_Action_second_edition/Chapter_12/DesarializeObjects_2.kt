import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.full.primaryConstructor

data class Config(val host : String,val port : Int,val debug: Boolean)

class ObjectSeed<T : Any>(private val targetClass : KClass<T>){
  private val consts = targetClass.primaryConstructor!!
  private val valueArguments = mutableMapOf<KParameter, Any?>()
  
  fun setSimpleProperty(propertyName : String,value : Any?){
    val param = consts.parameters.find{ it.name == propertyName }  ?: error("Unknown property : $propertyName")
    valueArguments[param] = value
    println("Set ${param.name}  =  $value")
  }
  
  fun spawn(): T{
    println(" spawning ${ targetClass.simpleName}....")
    
    return consts.callBy(valueArguments)
  }
}
fun main(){
  val seed = ObjectSeed(Config::class)
  
  seed.setSimpleProperty("host","localhost")
  seed.setSimpleProperty("port",8089)
  seed.setSimpleProperty("debug",true)
  
  val config = seed.spawn()
  println("Result : $config")
  println("Host : ${config.host}, Port : ${config.port},  Debug : ${config.debug}")
}