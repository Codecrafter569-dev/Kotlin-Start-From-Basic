fun main(){
  val javalogo = """
       ||       //
       ||   //
       ||//
       ||//  
       ||   //
       ||       //
  """.trimMargin()
  println(javalogo)
  
  
val poam = """
  | Teri kaliay Teri
  | toko ham paweee
  | Hey Teri galiya 
  """.trimMargin()
  println(poam)
  
  
  val expectedPage = """
<html lang="en">
<head>
<title>A page</title>
</head>
<body>
<p>Hello, Kotlin!</p>
</body>
</html>
""".trimIndent()

println(expectedPage)

val expectedObject = """
{
  "name": "Vikash Kumar",
  "age" : 16,
  "HomeTown":"Munich"
}
""".trimIndent()
println(expectedObject)

}
