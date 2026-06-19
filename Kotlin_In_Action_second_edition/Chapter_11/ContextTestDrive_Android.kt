open class Context{
  fun startActivity(className: String){
    println("Starting activity : $className")
  }
  
}
open class Activity : Context()
class DetailActivity: Activity()
class ProfileActivity : Activity()


inline fun <reified T : Activity> Context.startActivity(){
  val className = T::class.java.simpleName 
  startActivity(className)
}
fun main(){
  val context = Context()
  context.startActivity<DetailActivity>()
  context.startActivity<ProfileActivity>()
}