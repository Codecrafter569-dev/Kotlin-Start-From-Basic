fun main(){
  val result = listOf(1,2,3,4,5,6,7)
      .asSequence()
      .map{
        print("map($it)")
        it*it
      }
      .filter{
        print("filter($it)")
        it % 2 == 0
      }
      
      println(result)
      
}