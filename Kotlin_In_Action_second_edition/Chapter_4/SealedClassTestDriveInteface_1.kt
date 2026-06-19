// ----------------------
// PAYMENT RESULT SYSTEM
// ----------------------

sealed interface PaymentResult

data class Success(
    val transactionId: String,
    val amount: Double
) : PaymentResult

data class Declined(
    val reason: String
) : PaymentResult

data class Pending(
    val referenceCode: String,
    val estimatedSeconds: Int
) : PaymentResult

data class Refunded(
    val originalId: String,
    val refundAmount: Double
) : PaymentResult


// ----------------------
// AUDIT SYSTEM
// ----------------------

sealed interface Auditable

data class AuditEvent(
    val event: String,
    val timestamp: Long
) : Auditable


// ----------------------
// COMBINED MODEL
// ----------------------

data class AuditedPayment(
    val paymentResult: PaymentResult,
    val audit: AuditEvent
)


// ----------------------
// PAYMENT HANDLER
// ----------------------

fun handlePayment(result: PaymentResult): String {
    return when (result) {

        is Success -> {
            "SUCCESS → Txn: ${result.transactionId}, Amount: ${result.amount}"
        }

        is Declined -> {
            "DECLINED → Reason: ${result.reason}"
        }

        is Pending -> {
            "PENDING → Ref: ${result.referenceCode}, Wait: ${result.estimatedSeconds}s"
        }

        is Refunded -> {
            "REFUNDED → Original Txn: ${result.originalId}, Amount: ${result.refundAmount}"
        }
    }
}


// ----------------------
// AUDIT LOGGER
// ----------------------

fun logAudit(message: String): AuditEvent {
    return AuditEvent(
        event = message,
        timestamp = System.currentTimeMillis()
    )
}


// ----------------------
// PROCESSOR (REAL LOGIC)
// ----------------------

fun processPayment(result: PaymentResult): AuditedPayment {

    val message = handlePayment(result)

    val audit = logAudit(message)

    return AuditedPayment(
        paymentResult = result,
        audit = audit
    )
}


// ----------------------
// MAIN FUNCTION
// ----------------------

fun main() {

    val payments = listOf(
        Success("TXN1001", 1000.0),
        Declined("Card Expired"),
        Pending("REF2024", 45),
        Refunded("TXN1001", 1000.0)
    )

    for (payment in payments) {

        val processed = processPayment(payment)

        println("===================================")
        println("Payment Result:")
        println(handlePayment(processed.paymentResult))

        println("Audit Log:")
        println("Event → ${processed.audit.event}")
        println("Time  → ${processed.audit.timestamp}")
    }
}