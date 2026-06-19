typealias ValidateInput = String

fun saveAlias(v : ValidateInput): Unit{
  println("Save (alies) : $v")
}

@JvmInline
value class ValidateInput2(val s : String)
fun saveInLine(v : ValidateInput2): Unit{
  println("saving (inLine) : ${v.s}")
}
fun main(){
  val rawInput = "need Validating!!!..."
  saveAlias(rawInput)
  saveInLine(ValidateInput2(rawInput))
}