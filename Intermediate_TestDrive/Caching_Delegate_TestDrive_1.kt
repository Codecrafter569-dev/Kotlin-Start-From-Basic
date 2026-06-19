import kotlin.reflect.KProperty

class CachedDelegate<T>(private val compute: () -> T){
  private var cached: T? = null
  
  operator fun getValue(thisRef: Any?,property: KProperty<*>): T {
    if (cached == null) {
       println("Computing ${property.name}") 
       cached = compute()
    }else{
      println(" Using cached ${property.name}")
    }
    return cached!!
  }
}

class DataAnalyzer(val data: List<Int>){
  val average: Double by CachedDelegate {data.average()}
  val max : Int by CachedDelegate{data.max()}
}
fun main() {
    val c1 = DataAnalyzer(listOf(10,20,30,40,50))
    println(c1.average)
    println(c1.average)
    println(c1.max)
    println(c1.max)
}