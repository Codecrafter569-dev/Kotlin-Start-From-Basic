fun main(){
  val sum = {x:Int,y:Int -> 
      println("Computing the sum of $x and $y ...")
      x+y
     }
     println(sum(34,89))
     
     val diviede = {a:Int , b:Int  -> 
     println("Dividing $a by $b ")
     a/b
     }
     
     println(diviede(10,2))
}