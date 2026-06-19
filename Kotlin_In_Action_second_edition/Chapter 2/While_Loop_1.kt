fun main() {
    var i = 1
    
    outer@ while( i <= 3){
      var j = 1
      while( j <= 3){
        if (j == 2) {
            j++
            continue
        }
        if(i == 3)break@outer
        println("i = $i  j=$j")
        j++
      }
      i++
    }
}