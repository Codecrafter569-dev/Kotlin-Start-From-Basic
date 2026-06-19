
fun main(){
  val temperatures = listOf(27.7,29.9,22.0,35.5,19.1)
  println(temperatures.windowed(2))
  println(temperatures.windowed(3))
  
  val rollingAvg = temperatures.windowed(3){ window -> window.sum() / window.size }
  val rollingSum = temperatures.windowed(3) { window -> window.sum() }
  println(rollingAvg)
  println(rollingSum)
  
  val chuncked = temperatures.chunked(2)
  println(chuncked)
  
  val nums = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
  
  val numSum2 = nums.windowed(4){ window -> window.sum() }
  val numSumchunked = nums.chunked(2) { chad -> chad.sum() }
  
  println(nums)
  println(numSum2)
  println(numSumchunked)
}