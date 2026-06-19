import kotlin.reflect.KClass
interface FieldValidator<in T>{
  fun validate(input : T): Boolean
}
object DefaultStringValidator : FieldValidator<String>{
  override fun validate(input : String) = input.isNotEmpty()
}
object DefaultIntValidator : FieldValidator<Int>{
  override fun validate(input : Int) = input >= 0
}

object Validator{
  private val validators = mutableMapOf<KClass<*>,FieldValidator<*>>()
  
  fun <T : Any> registerValidator(
  kClass : KClass<T>,
  fieldValidator : FieldValidator<T>
  ){
    validators[kClass] = fieldValidator
  }
  
  @Suppress("UNCHECKED_CAST")
  operator fun <T : Any> get(kClass : KClass<T>) : FieldValidator<T> = validators[kClass] as? FieldValidator<T> ?: throw IllegalArgumentException(
  "No Validator for ${kClass.simpleName}"
  )
}
fun main(){
  Validator.registerValidator(String::class,DefaultStringValidator)
  Validator.registerValidator(Int::class,DefaultIntValidator)
  
  
  println(Validator[String::class].validate("Kotlin"))
  println(Validator[Int::class].validate(9393))
  
  println(Validator[String::class].validate(""))
  println(Validator[Int::class].validate(-2))
  
}