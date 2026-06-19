import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> synchronized(lock:Lock,action: () -> T): T {
  lock.lock()
  
  try{
    return action()
  }finally{
    lock.unlock()
  }
}
fun main(){
  val lock = ReentrantLock()
  
  synchronized(lock){
    println("Task A running under lock/....")
  }
  
  synchronized(lock){
    println("Task B Running under lock....")
  }
}