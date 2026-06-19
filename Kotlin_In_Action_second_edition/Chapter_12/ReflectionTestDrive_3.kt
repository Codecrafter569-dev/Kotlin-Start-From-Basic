import kotlin.reflect.full.*
import kotlin.reflect.KMutableProperty1
data class Config(
var host:String,
var port: Int,
var debug: Boolean

)

fun setPropertyByName(obj:Any,propertyName : String,newValue: Any){
  val kClass = obj::class
  
  val prop = kClass.memberProperties.firstOrNull{ it.name == propertyName }
  
  if(prop == null){
    println("Property $propertyName not found!!")
  }
  
  if(prop is KMutableProperty1<*,*>){
    @Suppress("UNCHECKED_CAST")
    val mutableProp = prop as KMutableProperty1<Any,Any>
    mutableProp.set(obj,newValue)
    println("Set $propertyName === $newValue")
    
  }else{
    println("Property $propertyName  is read-only (val)!!")
  }
}
fun main(){
  val config = Config("localhost",8080,false)
  println("Before : $config")
  
  
  setPropertyByName(config,"host","production.server.com")
  setPropertyByName(config,"port",900)
  setPropertyByName(config,"debug",true)
  
  
  println("After : $config")
  
  setPropertyByName(config,"timeout",30)
}