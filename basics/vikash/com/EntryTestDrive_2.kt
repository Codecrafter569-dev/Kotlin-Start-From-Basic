fun main() {
 val mode = "dev" 
    when(mode){
      "dev" -> println("Development mode chal raha hai")
      "prod" -> println("Production mode chal raha hai")
      "test" -> println("Testing model chal raha hai")
      else -> println("Default mode - koi argument nahi diya")
    }
    val globalMessage = "Main se pehle bhi cheezein chalti hain!"

println(globalMessage)
println(setup())
}

fun setup(): String{
  println("Step 1: setup() chal raha hai")
  return "Setup Complete"
}