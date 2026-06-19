import java.io.BufferedWriter
import java.io.FileWriter
import kotlin.io.path.Path
import kotlin.io.path.useLines

// Writing: use ensures the writer is closed even if an exception occurs
fun writeReport(fileName: String, lines: List<String>) {
    BufferedWriter(FileWriter(fileName)).use { writer ->
        lines.forEach { writer.appendLine(it) }

        println("Report written to $fileName")
    }
    // writer.close() called automatically — even on exception
}

// Reading: useLines gives a lazy Sequence<String>
fun findFirstError(fileName: String): String? {
    return Path(fileName).useLines { lines ->
        lines.firstOrNull { it.startsWith("ERROR") }
    }
}

fun main() {
    val reportLines = listOf(
        "INFO: App started",
        "INFO: Connected to DB",
        "ERROR: Timeout on query",
        "INFO: Retrying..."
    )

    writeReport("report.txt", reportLines)

    val firstError = findFirstError("report.txt")

    println("First error: $firstError")
}