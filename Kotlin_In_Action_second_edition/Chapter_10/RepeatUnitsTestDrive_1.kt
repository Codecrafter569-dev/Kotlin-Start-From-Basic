fun repeatUnit(condition: (Int) -> Boolean , action:() -> Unit){
  var times = 0
  while(!condition(times)){
    action()
    times++
  }
  
  println("Stopped after $times iterations....")
}
fun main(){
  var count  = 0
  repeatUnit({it >= 5}){
    count++
    println("Running .... count = $count")
  }
  
  repeatUnit({it >= 3}){
    println("Boom!!!")
  }
}