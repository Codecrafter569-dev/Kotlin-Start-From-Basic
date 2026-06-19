Summary
Internal DSLs are an API design pattern you can use to build more expressive
APIs with structures composed of multiple method calls.

Lambdas with receivers employ a nesting structure to redefine how methods
are resolved in the lambda body.

The type of a parameter taking a lambda with a receiver is an extension func-
tion type, and the calling function provides a receiver instance when invoking
the lambda.

The benefit of using Kotlin internal DSLs rather than external templates or
markup languages is the ability to reuse code and create abstractions.

Defining extensions on primitive types allows you to create a readable syntax for
various kinds of literals, such as durations.

Using the invoke convention, you can call arbitrary objects as if they were
functions.

The kotlinx.html library provides an internal DSL for building HTML pages
and can be extended to suit your applications.

The Kotest library provides an internal DSL that supports readable assertions in
unit tests.

The Exposed library provides an internal DSL for working with databases. 