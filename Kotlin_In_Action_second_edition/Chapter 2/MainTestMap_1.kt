fun main() {
    val binaryReps = mutableMapOf<Char,String>()
    
    for(c in 'A'..'Z'){
      val binary = c.code.toString(2)
      binaryReps[c] = binary
    }
    for((latter,values) in binaryReps){
      println("$latter == $values")
    }
}