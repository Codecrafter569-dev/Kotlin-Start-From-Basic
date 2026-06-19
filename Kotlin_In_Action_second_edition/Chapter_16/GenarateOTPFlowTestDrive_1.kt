import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds
fun generatOtpFlow(): Flow<Int> = flow{
  println("---- OTP Generator STARTED -----")
  repeat(4){
    index ->
    delay(300.milliseconds)
    val otp = (1000..9999).random()
    emit(otp)
  }
  println("OTP Generator FINISHED ....")
}
fun main() = runBlocking{
  val otpFlow = generatOtpFlow()
  
  println("===== Collector 1 subscribes ====")
  otpFlow.collect{ otp ->
  println("Collector 1 got OTP : $otp")
  }
  
  println("====== Collector 2 subscribes =====")
  otpFlow.collect{ otp ->
  println("Collector 2 got OTP : $otp")
  }
}
