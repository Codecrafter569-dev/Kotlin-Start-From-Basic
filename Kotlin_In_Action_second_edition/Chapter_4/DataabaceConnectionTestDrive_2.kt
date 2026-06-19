class DatabaceConnection private constructor(val soruce: String){
  companion object {
    fun fromLocal(): DatabaceConnection {
      return DatabaceConnection("Local Databace")
    }
    fun fromRemote(host: String): DatabaceConnection {
      return DatabaceConnection("Remote Host: $host")
    }
  }
  
}

fun main(){
  val local = DatabaceConnection.fromLocal()
  val remote = DatabaceConnection.fromRemote("server02")
  
  println(local.soruce)
  println(local.soruce)
  println(remote.soruce)
}