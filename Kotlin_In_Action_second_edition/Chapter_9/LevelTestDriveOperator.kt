data class Level(val value: Int){
  operator fun inc()  = Level((value+1).coerceAtMost(99))
  operator fun dec() = Level((value-1).coerceAtMost(1))
  
  override fun toString()  = "Level($value)"
} 
fun main(){
  var level = Level(1)
  println(level++)
  println(level)
  println(++level)
  
  var maxLevel = Level(99)
  println(++maxLevel)
  
}