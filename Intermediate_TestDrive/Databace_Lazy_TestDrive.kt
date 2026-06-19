class Databace{
  fun connect(){
    println("Connecting to the Databace....")
  }
  fun query(sql:String): List<String> {
  println("This is provide from : $sql")
    return listOf("Data1","Vikash","Sinidiha")
  }
}
val databaceConnection: Databace by lazy{
  val db = Databace()
  db.connect()
  db
}
fun fetchData(){
  val data = databaceConnection.query("SELECT * FROM data")
  println("Data: $data")
}
fun main() {
    fetchData()
    
    fetchData()
}