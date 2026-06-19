import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// State can be modeled as a sealed class
sealed class LoginState {
    object LoggedOut : LoginState()
    object Loading : LoginState()
    data class LoggedIn(val username: String) : LoginState()
}

class AuthManager {
    private val _loginState = MutableStateFlow<LoginState>(LoginState.LoggedOut)
    val loginState = _loginState.asStateFlow()

    fun login(username: String) {
        _loginState.update { LoginState.Loading }
        // Simulate login...
        _loginState.update { LoginState.LoggedIn(username) }
    }

    fun logout() {
        _loginState.update { LoginState.LoggedOut }
    }
}

fun main(){
  
runBlocking {
    val auth = AuthManager()

    // UI is observing state
    launch {
        auth.loginState.collect { state ->
            when (state) {
                is LoginState.LoggedOut -> println("[UI] Show login screen")
                is LoginState.Loading   -> println("[UI] Show loading spinner")
                is LoginState.LoggedIn  -> println("[UI] Welcome, ${state.username}!")
            }
        }
    }

    delay(100)
    println("\n--- User clicks Login ---")
    auth.login("Vikash")

    delay(100)
    println("\n--- User clicks Logout ---")
    auth.logout()

    delay(100)
    cancel()
}

}