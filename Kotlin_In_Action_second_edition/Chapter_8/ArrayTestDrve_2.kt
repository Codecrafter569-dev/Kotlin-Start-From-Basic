fun  main(){
 val fiveZeros = IntArray(5) 
 val fiveZerossToo = intArrayOf(0,0,0,0,0)
 val square = IntArray(5){ i -> (i+1) * (i+1)}
 
 println(fiveZeros.joinToString())
 println(fiveZerossToo.joinToString())
 println(square.joinToString())
}