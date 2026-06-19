class Alpha{
  override fun toString() = " I Am a outer class ..."
  
  fun alphabete()  = with(StringBuilder()){
    for(letter in 'A'..'Z'){
      append("$letter ,")
    }
    append("This is all alphabetess ...")
    
    toString()
  }
}
fun main(){
  val obj = Alpha()
  println(obj.alphabete())
  println(obj.alphabete())
  
  println(obj.toString())
}