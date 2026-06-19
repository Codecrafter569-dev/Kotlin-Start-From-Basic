import java.io.File;
fun main(){
  val naturalNumbers = generateSequence(2){it+1}
  val numberto100 = naturalNumbers.takeWhile{ it <= 100 }
  println(numberto100.toList())
  println(numberto100.sum())
  
  val fibonacci = generateSequence(Pair(0,1)) { (a,b) -> Pair(b,a+b)}
  .map{it.first }
  .take(10)
  .toList()
  
  println(fibonacci)
  
 go() 
}
fun go(){
  
}