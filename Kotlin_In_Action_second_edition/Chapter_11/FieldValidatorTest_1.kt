interface FieldValidator<in T>{
  fun validate(input : T): Boolean
}
object AnyValidator : FieldValidator<Any>{
  override fun validate(input : Any) = input.toString().isNotEmpty()
}

fun validateField(validator : FieldValidator<String>,value : String): Boolean {
  return validator.validate(value)
}


fun main(){
println(AnyValidator.validate(8383))
  val re1 = validateField(AnyValidator,"Hello")
  println(re1)
  
  val empty = validateField(AnyValidator,"")
  println(empty)
}