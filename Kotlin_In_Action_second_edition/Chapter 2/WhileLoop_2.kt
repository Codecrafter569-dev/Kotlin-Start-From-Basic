fun main() {
    var i =0
    var j =0
    outer@ while(i <= 5){
  
      while(j <= 5){
        if(i == 4) break@outer
        println("i=$i , j=$j")
        j++
      }
      i++
    }
}