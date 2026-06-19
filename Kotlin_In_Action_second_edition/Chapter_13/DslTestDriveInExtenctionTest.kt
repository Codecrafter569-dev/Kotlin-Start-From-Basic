// We build a simplified SQL-like DSL using member extensions

// ── Column: represents a database column ─────────────────────────────────
data class Column<T>(val name: String)

// ── Condition: represents a WHERE clause piece ───────────────────────────
data class Condition(val expression: String) {
    infix fun and(other: Condition) = Condition("($expression AND ${other.expression})")
    infix fun or(other: Condition)  = Condition("($expression OR ${other.expression})")
}

// ── QueryBuilder: the scope where column conditions are valid ─────────────
object QueryBuilder {

    // Member extension: Column<T>.eq() only works INSIDE QueryBuilder scope
    infix fun <T> Column<T>.eq(value: T): Condition =
        Condition("${this.name} = '$value'")

    infix fun <T> Column<T>.neq(value: T): Condition =
        Condition("${this.name} != '$value'")

    infix fun Column<Int>.gt(value: Int): Condition =
        Condition("${this.name} > $value")

    infix fun Column<Int>.lt(value: Int): Condition =
        Condition("${this.name} < $value")

    infix fun Column<String>.like(pattern: String): Condition =
        Condition("${this.name} LIKE '$pattern'")
}

// ── Table: represents a database table ───────────────────────────────────
class Table(val tableName: String) {
    private val conditions = mutableListOf<Condition>()
    private val selectedCols = mutableListOf<String>()

    fun select(block: QueryBuilder.() -> Condition): Table {
        // QueryBuilder is the receiver — member extensions become available
        val condition = QueryBuilder.block()
        conditions.add(condition)
        return this
    }

    fun toSQL(): String {
        val where = if (conditions.isEmpty()) ""
                    else " WHERE " + conditions.joinToString(" AND ") { it.expression }
        return "SELECT * FROM $tableName $where"
    }
}

// ── Column definitions ────────────────────────────────────────────────────
val name    = Column<String>("name")
val age     = Column<Int>("age")
val country = Column<String>("country")
val salary  = Column<Int>("salary")

fun table(name: String) = Table(name)

fun main() {
    // Single condition
    val q1 = table("employees")
        .select { name eq "Alice" }
    println(q1.toSQL())

    // Compound condition using 'and'
    val q2 = table("employees")
        .select { (age gt 25) and (country eq "India") }
    println(q2.toSQL())

    // Three conditions
    val q3 = table("employees")
        .select { (salary gt 50000) and (country eq "USA") and (age lt 40) }
    println(q3.toSQL())

    // LIKE pattern
    val q4 = table("customers")
        .select { name like "A%" }
    println(q4.toSQL())

    // name.eq() outside select{} would NOT compile because
    // QueryBuilder is not in scope there — member extension enforces this
}
