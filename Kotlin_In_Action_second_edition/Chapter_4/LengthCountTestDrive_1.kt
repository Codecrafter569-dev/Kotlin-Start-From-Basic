class LengthCount{
  var counter: Int = 0
    private set 
    
  fun address(word: String){
    counter += word.length
  }
}
fun main(){
  val c1 = LengthCount()
  c1.address("Hi How i can help you bro tell me..")
  println(c1.counter)
}