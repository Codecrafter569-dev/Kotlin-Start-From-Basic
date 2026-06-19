fun processAnswer(f:(Int) -> Int){
  println(f(23))
}
fun main(){
  processAnswer{number -> number+1}
  
  val adder = object : (Int,Int) -> Int {
    override fun invoke(p1:Int,p2:Int) : Int = p1+p2
  }
  
  val evenOdd = object : (Int) -> String{
    override fun invoke(a:Int) : String = if(a% 2 == 0) "Even" else "Odd"
  }
  println(adder(20,33))
  println(evenOdd(12))
  println(evenOdd(89))
}