fun main() {
    outer@ for(i in 1..3){
       for(j in 1..3){
         if(i == 3){
           break@outer
         }
         println("i =$i j = $j")
       }
    }
}