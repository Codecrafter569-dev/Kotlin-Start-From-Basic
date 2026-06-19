fun main(){
  val powerOfTwo = generateSequence(1){ it * 2 }
                    .take(8)
                    .toList()
                    
  println(powerOfTwo)
}