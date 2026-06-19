import kotlinx.coroutines.flow.*
import kotlinx.coroutines.test.*
import app.cash.turbine.*   // Turbine import
import kotlin.test.*

fun main() = runTest{
 val result =  flowOf(1,2,3,4).toList()
 println(result)
 assertEquals(4,result.size)
 println(result)
}