import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*
class ChatRoom{
  private val _newMessage = MutableSharedFlow<String>()
  val newMassage = _newMessage.asSharedFlow()
  
  private val _onlineCount = MutableStateFlow<Int>(0)
  val onlineCount = _onlineCount.asStateFlow()
  
  fun userJoin(){ _onlineCount.update{ it +1}}
  fun userLeaves(){ _onlineCount.update{it - 1}}
  
  suspend fun sendMessage(msg : String){
    _newMessage.emit(msg)
    
  }
}
fun main(): Unit = runBlocking{
  val room = ChatRoom()
  val messageJob = launch{
    room.newMassage.collect{ msg ->
      println("[Chat] $msg")
    }
  }
  
  room.userJoin()
  room.userJoin()
  delay(50)
  
  room.sendMessage("Hello everyone !")
  room.sendMessage("AnyOne here !?")
  delay(50)
  
  println("online right Now : ${ room.onlineCount.value}")
  
  room.userLeaves()
  println("After leaves one : ${room.onlineCount.value}")
  messageJob.cancel()
}