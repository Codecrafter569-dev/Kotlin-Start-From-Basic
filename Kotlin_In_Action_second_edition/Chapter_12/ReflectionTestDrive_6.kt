import kotlin.reflect.full.*
import kotlin.reflect.KClass
fun toJsonValue(value: Any?): String = when(value){
  null -> "null"
  is String  -> "\"$value\""
  is Number,
  Boolean    -> value.toString()
  else     -> buildString{
    val kClass = value::class as KClass<Any>
    kClass.memberProperties.joinTo(this,prefix="{",postfix="}"){
      prop -> "\"${prop.name} \"  : ${toJsonValue(prop.get(value))}"
    }
  }
}

fun serializeList(items: List<Any>): String{
  return items.joinToString(prefix="[",postfix="]"){
    toJsonValue(it)}
  }
data class Product(val id:Int,val name:String,val price:Double)
fun main(){
  val products = listOf(
  Product(1,"Keyboard",50.908),
  Product(2,"Mouse",30.90),
  Product(3,"Monitor",200.900)
  )
  
  val json = serializeList(products)
  
  println(json)
}