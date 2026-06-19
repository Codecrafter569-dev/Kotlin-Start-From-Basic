data class Screen(val title: String,val route: String,val isProtected: Boolean)
val Screen.fullRoute : String
     get() = if(isProtected) "/auth$route" else route
     
val Screen.displayTitle: String
    get() = " ${title.uppercase()}"
    
val List<Screen>.publicScreens: List<Screen>
   get() = filter{ !it.isProtected}
   

fun main() {
    val screens = listOf(Screen("Home","/home",false),Screen("Profile","/profile",true),Screen("Settings","/settings",true),Screen("Login","/login",false)
    )
    
    println("All Routes:")
    screens.forEach{println(" ${it.displayTitle} -> ${it.fullRoute}")}
    
    println("\nPublic Screens :")
    screens.publicScreens.forEach{println(" ${it.title}")}
}