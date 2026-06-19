fun addAnswer(list1: MutableList<Any>){
try{
  list1.add(49)
  }catch(e : ClassCastException){
    println(e)
  }
}
fun main(){
  val strings = mutableListOf("abc","Hello","Be","Kaya","Huaaa","Bolo","Bee")
  println(strings)
//  addAnswer(strings)
  println("Compiler save us And then you ....")
  
}