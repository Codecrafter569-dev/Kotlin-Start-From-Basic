interface Seed{
  fun setSimpleProperty(name: String,value: Any?)
  fun spawn(): Any?
}

class SimpleSeed(val targetClass : String): Seed{
  private val properties = mutableMapOf<String,Any?>()
  
  override fun setSimpleProperty(name: String,value:Any?)
  {
    properties[name] = value
    
    println("[Seed] Stored property : $name = $value")
  }
  
  override fun spawn(): Any?{
    println("[Seed] Spawning $targetClass  with : $properties")
    return properties
  }
}
fun main(){
  val seed = SimpleSeed("Book")
  seed.setSimpleProperty("title","Catch-23")
  seed.setSimpleProperty("year",1961)
  seed.setSimpleProperty("available",true)
  
  val result = seed.spawn()
  println("Final result is : $result")
  
  
}