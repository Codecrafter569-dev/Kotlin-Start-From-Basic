interface StringProcessor {
    fun process(value: String?)
}

class StringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        } else {
            println("Received null!!")
        }
    }
}

class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        } else {
            println("Received null!!")
        }
    }
}

fun main() {
    val printer1 = StringPrinter()
    printer1.process("Hello")
    printer1.process(null)

    val printer2 = NullableStringPrinter()
    printer2.process("Hello")
    printer2.process(null)
}