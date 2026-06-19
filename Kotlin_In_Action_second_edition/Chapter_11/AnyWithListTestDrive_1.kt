fun printContents(list: List<Any>){
  println(list.joinToString())
}
fun main(){
  printContents(listOf("abc","bac","Helo","bolo","bee"))
  
  printContents(listOf(1,2,3,4,5,6,7,8,9))
}