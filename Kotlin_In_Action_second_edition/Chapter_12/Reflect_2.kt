import kotlin.reflect.full.*
data class Car(val brand: String,val speed: Int,val electric : Boolean)
data class Book(val title: String,val pages : Int)
fun inspectObject(obj : Any){
  val kClass = obj::class
  println("The class Simple Name is : ${kClass.simpleName}")
  println("Qualified Name : ${kClass.qualifiedName}")
  println("The class is Data class :${kClass.isData}")
  println("Properties ___----->")
  kClass.memberProperties.forEach{
    prep -> println("${prep.name}  -> ${prep.returnType}")
  }
}
fun main(){
  inspectObject(Car("Suzuki",230,false))
  inspectObject(Book("Kotlin in Action",559))
}