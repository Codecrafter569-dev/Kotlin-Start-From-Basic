@DslMarker
annotation class CardDsl

@CardDsl
open class HtmlElement(val tag: String) {
    private val children  = mutableListOf<HtmlElement>()
    protected var text    = ""

    operator fun String.unaryPlus() { text = this }

    protected fun <T : HtmlElement> init(child: T, block: T.() -> Unit): T {
        child.block()
        children.add(child)
        return child
    }

    override fun toString(): String {
        val inner = text + children.joinToString("")
        return "<\$tag>\$inner</\$tag>"
    }
}

class DIV : HtmlElement("div") {
    fun h3(block: H3.() -> Unit)  = init(H3(), block)
    fun p(block: P.() -> Unit)    = init(P(), block)
    fun div(block: DIV.() -> Unit) = init(DIV(), block)
}

class H3 : HtmlElement("h3")
class P  : HtmlElement("p")

fun div(block: DIV.() -> Unit) = DIV().apply(block)

// ── Custom reusable DSL function ──────────────────────────────────────────

// A "card" is a div with a title and body — repeated pattern
fun DIV.card(title: String, body: String) {
    div {           // 'this' here is the outer DIV
        h3 { +"\$title" }
        p  { +"\$body"  }
    }
}

fun main() {
    // WITHOUT reuse — lots of repetition
    val withoutReuse = div {
        div {
            h3 { +"Kotlin" }
            p  { +"A modern JVM language." }
        }
        div {
            h3 { +"Java" }
            p  { +"The classic JVM language." }
        }
        div {
            h3 { +"Python" }
            p  { +"Great for scripting and ML." }
        }
    }
    println("Without reuse:")
    println(withoutReuse)
    println()

    // WITH reuse — clean DSL
    val withReuse = div {
        card("Kotlin", "A modern JVM language.")
        card("Java",   "The classic JVM language.")
        card("Python", "Great for scripting and ML.")
    }
    println("With reuse:")
    println(withReuse)
}
