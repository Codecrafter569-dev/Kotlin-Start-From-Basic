fun main() {
    for(i in 1..2){
      for(j in 1..3){
        if (j == 2) {
            continue
        }
        println("i=$i j=$i")
      }
    }
}