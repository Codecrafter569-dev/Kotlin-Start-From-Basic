import kotlinx.coroutines.flow.*
import kotlinx.coroutines.*

// StateFlow representing the app's current theme
object AppSettings {
    private val _theme = MutableStateFlow("Light") // Default theme is Light
    val theme = _theme.asStateFlow()

    fun switchTheme(newTheme: String) {
        _theme.value = newTheme // Directly set the new value
    }
}

fun main() = runBlocking {
    println("Current theme: ${AppSettings.theme.value}") // Read without collecting

    AppSettings.switchTheme("Dark")
    println("After switch: ${AppSettings.theme.value}")

    // A late subscriber can collect changes going forward
    val job = launch {
        AppSettings.theme.collect { theme ->
            println("Theme collector sees: $theme")
        }
    }

    delay(100)
    AppSettings.switchTheme("AMOLED Black")
    // StateFlow only emits if the value ACTUALLY changes
    AppSettings.switchTheme("AMOLED Black") // Same value — NO new emission!
    AppSettings.switchTheme("Light")

    delay(300)
    job.cancel()
}
// Output:
// Current theme: Light
// After switch: Dark
// Theme collector sees: Dark         ← collector starts, gets current value
// Theme collector sees: AMOLED Black
// Theme collector sees: Light        ← duplicate emission was skipped!
