fun main() {
    outer@ for(i in 1..3){
      for(j in 1..3){
        if (j == 3) {
            break
        }
        println("i =$i j = $j")
      }
    }
}