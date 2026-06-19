Summary
Concurrency refers to working with multiple tasks at the same time, manifesting
in intertwined execution. Parallelism refers to executing physically at the same
time, making use of modern multicore systems effectively.

Coroutines are a lightweight abstraction working on top of threads for concur-
rent execution.

The core concurrency primitive in Kotlin is the suspending function—a func-
tion that can pause execution. A suspending function can be called from
another suspending function or from within a coroutine.

Unlike other approaches, such as reactive streams, callbacks, and futures, sus-
pending functions don’t change the shape of your code—it still looks sequential.

A coroutine is an instance of a suspendable computation.

Coroutines avoid the problems caused by blocking threads, which are expen-
sive, limited system resources.

Coroutine builders like runBlocking, launch, and async allow you to create new
coroutines.

Dispatchers decide on which thread or thread pool your coroutines run.

The different built-in dispatchers serve different purposes: Dispatchers.Default
is a general-purpose dispatcher, Dispatchers.Main helps you run operations on
the UI thread, and Dispatchers.IO is used for calling blocking IO tasks.

Most dispatchers, like Dispatchers.Default and Dispatchers.IO, are multi-
threaded dispatchers, meaning you need to take extra care when multiple
coroutines modify the same data in parallel.

You can specify a dispatcher when creating a coroutine or switch between dis-
patchers using withContext.

The coroutine context contains additional information associated with a corou-
tine. The dispatcher of a coroutine is part of the coroutine context. 