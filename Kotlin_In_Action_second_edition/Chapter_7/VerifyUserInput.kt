fun verifyUserInput(input: String?){
  if(input.isNullOrBlank()){
    println("Please fill in the required fields")
  }else{
    println("Input received : $input")
  }
}
fun main(){
  verifyUserInput("Vikash")
  verifyUserInput(" ")
  verifyUserInput(null)
}