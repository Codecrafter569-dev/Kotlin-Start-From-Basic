class MyClass {
  companion object {
    fun callMe(){
      println("companion object called !!?")
    }
  }
  
  //companion object Aja{
  ///  fun go(){
   //   println("Go and do hard work please...")
    //}
  //}
}
fun main(){
  MyClass.callMe()
  //MyClass.Aja.go()
}