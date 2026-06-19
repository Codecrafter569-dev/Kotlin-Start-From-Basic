interface FieldValidator<in T>{
  fun validate(input:T): Boolean
}
object DefaultStringValidator : FieldValidator<String>{
  override fun validate(input : String) = input.isNotEmpty()
}
object DefaultIntValidator : FieldValidator<Int>{
  override fun validate(input : Int)  =  input >= 0
}
fun main(){
  println(DefaultIntValidator.validate(93))
  println(DefaultStringValidator.validate("Kotlin"))
  println(DefaultStringValidator.validate(""))
  println(DefaultIntValidator.validate(99))
  println(DefaultIntValidator.validate(-90))
}