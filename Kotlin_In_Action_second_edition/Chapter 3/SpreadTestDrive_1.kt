fun main() {
   val arg = listOf("Vikash","Shahile","Aasis","Kumari","Hello")
    //val list1 = listOf("args:",*arg)
    println(arg)
    println(go(12,34,78,9,20,30))
}
fun go(vararg numbers: Int): Int{
  var result =0;
  for(num in numbers){
    result += num;
  }
  return result
}