class LoginService {
  private var _attempts: Int = 0
  
  var attempts : Int
    get() = _attempts
    set(value){
      _attempts = value
       if (_attempts >= 3) {
           println(" Account locked after $_attempts failed attempts!")
       }
    }
    val isLocked: Boolean 
    get() = attempts >= 3
}
fun main() {
    val login = LoginService()
    repeat(5){
      if (!login.isLocked) {
          login.attempts++
          println(" wrong password . Attempt : ${login.attempts}")
      } else {
         println("Cannot try - account is locked !") 
      }
    }
}