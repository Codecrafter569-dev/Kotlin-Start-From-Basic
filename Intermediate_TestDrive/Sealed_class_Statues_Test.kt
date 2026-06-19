sealed class Status{
  data object Loading : Status()
  data class Error(val probelm: Problem) : Status(){
    enum class Problem{
      NETWORK,
      TIMEOUT,
      UNKNOW
    }
  }
  data class OK(val data: List<String>): Status()
}
fun handleStatus(status: Status){
  when(status){
    is Status.Loading -> println("Loading ....")
    is Status.OK -> println("Data recevied : ${status.data}")
    is Status.Error -> when(status.probelm){
      Status.Error.Problem.NETWORK -> println("NETWORK issue")
      Status.Error.Problem.TIMEOUT -> println("Request timed out")
      Status.Error.Problem.UNKNOW -> println("UNKNOW error occurred")
    }
  }
}
fun main() {
    val status1 : Status = Status.Error(Status.Error.Problem.NETWORK)
    val status2 : Status = Status.OK(listOf("Data1","DATA2"))
    
    handleStatus(status1)
    handleStatus(status2)
}