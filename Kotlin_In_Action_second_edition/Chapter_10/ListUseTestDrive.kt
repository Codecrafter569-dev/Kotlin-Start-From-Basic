fun main(){
  val author = listOf("Sveta","Seb","Roman","Dima","Hama","Koko")
  
  val reader = listOf("Vikash","Alok","Anmol","Nafisa","Sveta")
  
  println(reader.filter{ it !in author })
}