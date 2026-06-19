import java.util.ServiceLoader
interface PaymentService {
  fun pay(amount: Double)
}

fun <T> loadServiceOld(clazz : Class<T>): ServiceLoader<T>{
  return ServiceLoader.load(clazz)
}

inline fun <reified T> loadService(): ServiceLoader<T>{
  return ServiceLoader.load(T::class.java)
}


fun main(){
  val old = loadServiceOld(PaymentService::class.java)
  println("Old way loaded : $old")
  
  val new = loadService<PaymentService>()
  println("New way loaded : $new")
}