Summary
Intermediate operators are used to transform flows into other flows; they oper-
ate on an upstream flow and return a downstream flow. Intermediate operators
are cold; they are not executed until a terminal operator is called.

A large portion of the intermediate operators available for sequences are also
available directly for you to use with flows. Flows also provide additional inter-
mediate operators that allow you to perform transformations (transform), man-
age the context in which a flow is executed (flowOn), and run code at specific
phases during the execution of a flow (onStart, onCompletion, etc.).

Terminal operators like collect run the code of a flow or, in the case of hot
flows, take care of subscribing to the flow.

You can build your own operators by collecting a flow from within another flow
builder, emitting transformed elements from it.

Several external frameworks, like Jetpack Compose and Compose Multiplat-
form, provide direct integration with Kotlin flows.