class DelegatingCollection<T>(private val innerList: MutableList<T> = mutableListOf()): Collection<T>{
  
  
  override val size : Int 
         get() = innerList.size
         
         override fun isEmpty(): Boolean = innerList.isEmpty()
         override fun contains(element: T): Boolean = 
            innerList.contains(element)
            
            
      override fun iterator(): Iterator<T>  = 
      innerList.iterator()
      
      
  override fun containsAll(elements:Collection<T>): Boolean 
  = innerList.containsAll(elements)
}
fun main(){
  val col = DelegatingCollection<String>()
  println(col.isEmpty())
  println(col.size)
}