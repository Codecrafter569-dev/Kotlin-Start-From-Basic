Summary
In Kotlin, flows are a coroutine-based abstraction that makes it possible to work
with values that appear over time.

You differentiate between two types of flows: hot flows and cold flows.

Cold flows are inert by default and associated with a single collector. Cold flows
are constructed with the flow builder functions. Using the emit functions, val-
ues can be offered asynchronously.

Channel flows, a special type of cold flow, allow the emission of values from
multiple coroutines via the send function.

Hot flows are always active and are associated with multiple collectors, called
subscribers. Shared flows and state flows are instances of hot flows.

Shared flows can be used for broadcast-style communication of values across
coroutines.

Subscribers of shared flows receive emissions from the start of their subscrip-
tion and those values that were replayed by the shared flow.

State flows can be used to manage state in your concurrent system.

State flows perform equality-based conflation, meaning they only perform emis-
sions when their value actually changes, not when assigning the same value mul-
tiple times.

Cold flows can be turned into hot flows via the shareIn and stateIn functions.