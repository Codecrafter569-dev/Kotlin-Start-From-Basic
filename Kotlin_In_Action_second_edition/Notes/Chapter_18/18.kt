Summary
Exceptions confined to a single coroutine can be handled the same way you
would in regular, non-coroutine-based code. Extra care is required when excep-
tions are thrown across coroutine boundaries.

By default, when an uncaught exception occurs in a coroutine, the parent
coroutine and all sibling coroutines are cancelled. This enforces the concept of
structured concurrency.

Supervisors, used via supervisorScope or another coroutine scope that has a
SupervisorJob, don’t cancel their other child coroutines when one of them fails.
They also don’t propagate uncaught exceptions further up the hierarchy of
coroutines.

await rethrows the exceptions from an async coroutine.

Supervisors are often used for long-running parts of applications. They often
also come as built-in parts of frameworks, like Ktor’s Application.

An uncaught exception gets propagated until it encounters a supervisor or
until the exception reaches the top of the hierarchy. At this point, the uncaught
exception will move to the CoroutineExceptionHandler, which is part of the
coroutine context. If no coroutine exception handler is present in the context,
the uncaught exception makes it to the system-wide exception handler.

The default system-wide exception handler is different for JVM and Android:
on JVM, it logs the stack trace to the error console, while on Android, it crashes
your application.

The CoroutineExceptionHandler acts as a last resort for processing exceptions—
while it can’t catch exceptions, it allows you to customize the way the exceptions
are logged. The CoroutineExceptionHandler sits in the context of your root
coroutine, at the very top of your hierarchy.

The CoroutineExceptionHandler only gets invoked if the topmost coroutine was
started using the launch builder. If it was started using the async builder, the
handler won’t be invoked; instead, it is the responsibility of the code that awaits
the Deferred to handle the exception.

Error handling in flows can be done by wrapping collect in a try-catch state-
ment or using the dedicated catch operator.

The catch operator only processes exceptions thrown upstream. It ignores
downstream exceptions. You can even use it to rethrow exceptions for further
processing downstream.

By using retry, you can restart the collection of a flow from the beginning, in
case of an exception, giving your code the chance to recover.

By using virtual time via runTest, testing coroutines code can be accelerated.
Any delays are automatically fast-forwarded.

The TestCoroutineScheduler, a part of the TestScope exposed by runTest, keeps
track of the current virtual time, and you can use functions like runCurrent, and
advanceUntilIdle for fine-grained control over the execution of your tests.

The test dispatcher is single-threaded, meaning you’ll have to manually ensure
newly started coroutines have time to run before you call your assertions.

The Turbine library allows you to write convenient tests for code based on flows.
Its core API is the test extension function that collects items from a flow and
allows you to use functions like awaitItem to check the emissions of the flow
under test.