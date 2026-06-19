fun <T> copyElemnts(source: Collection<T>, target: MutableCollection<T>){
  for(item in source){
    target.add(item)
  }
}
fun main(){
  val source : Collection<Int> = arrayListOf(3,4,5)
  val tarvet : MutableCollection<Int> = arrayListOf(1)
  
  copyElemnts(source,tarvet)
  println(tarvet)
}