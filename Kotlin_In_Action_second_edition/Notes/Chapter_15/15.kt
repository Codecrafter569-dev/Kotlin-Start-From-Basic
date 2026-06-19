Summary

Structured concurrency gives you control over the work coroutines are doing
and prevents rogue coroutines from escaping cancellation.

You can create new coroutine scopes using the suspending coroutineScope
helper function and the CoroutineScope constructor function. While named
similarly, they serve different purposes:

–coroutineScope is designed for concurrent decomposition of work: starting a
number of coroutines, waiting for them to calculate a result, and then
returning that result.

–CoroutineScope creates a coroutine scope used to associate coroutines with
the life cycle of a class. It is typically used with a SupervisorJob.

GlobalScope is a special coroutine scope that, while often shown in example
snippets, should not be used in application code because it breaks structured
concurrency.

The coroutine context manages how individual coroutines are executed. It is
inherited along the coroutines hierarchy.

The parent–child hierarchy between coroutines and coroutine scopes is estab-
lished via the associated Job object in the coroutine context.

Suspension points are places where coroutines can be paused and other corou-
tines can begin their work.

Cancellation is realized by throwing a CancellationException at suspension
points.

Cancellation exceptions should never be swallowed (caught and not pro-
cessed). Instead, they should either be rethrown or not be caught in the first
place.

Cancellation is a normal occurrence, and your code should be designed to han-
dle it.


You can invoke cancellation yourself using functions like cancel or withTimeout-
OrNull. Many existing frameworks can also cancel coroutines for you.

Marking a function with the suspend modifier is not enough to support cancel-
lation. However, Kotlin coroutines provide mechanisms that support you in
building cancellable suspending functions (e.g., functions like ensureActive or
yield as well as the isActive property).

Frameworks use coroutine scopes to help tie your coroutines to the life cycle of
the application (e.g., the time a viewmodel is shown on screen or in which a
request handler is executed). 