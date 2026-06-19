interface Container<T>{
  fun get(index: Int) : T
  fun size(): Int
}
class StringContainer(private val items: List<String>): Container<String>{
  override fun get(index: Int) : String = items[index]
  override fun size() : Int = items.size
} 

class GenricContainer<T>(private val items: List<T>) : Container<T>{
  override fun get(index: Int) : T = items[index]
  override fun size() : Int = items.size
}
fun main(){
 val sc = StringContainer(listOf("a","b","c","d","e","f","g","h"))
 println(sc.get(2))
 println(sc.size())
 val gc = GenricContainer(listOf(10,20,30,40,70,40))
 println(gc.get(4))
 println(gc.size())
}