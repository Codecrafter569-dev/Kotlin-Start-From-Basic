import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import kotlin.time.Duration.Companion.milliseconds

// Instead of flow { } builder, implementing Flow manually
// to show what's really happening under the hood
val manualFlow: Flow<String> = object : Flow<String> {
    override suspend fun collect(collector: FlowCollector<String>) {
        // This is exactly what the flow { } builder does internally
        println("[Producer] Emitting Hello")
        collector.emit("Hello") // Calls YOUR lambda directly!
        delay(500.milliseconds)
        println("[Producer] Emitting World")
        collector.emit("World")
    }
}

fun main() = runBlocking {
    manualFlow.collect { value ->
        // This lambda becomes collector.emit() under the hood
        println("[Collector] Received: $value")
        delay(200.milliseconds) // Collector can also suspend!
    }
}

// Output:
// [Producer] Emitting Hello
// [Collector] Received: Hello
// [Producer] Emitting World
// [Collector] Received: World
