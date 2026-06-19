#Summary#

The fun keyword is used to declare a function. The val and var keywords declare read-only and mutable variables, respectively.

While a val reference is read only, the object that it points to may still be mutable.

String templates help you avoid noisy string concatenation. Add the prefix $ to a variable name or surround an expression with ${} to have its value injected

into the string.

Classes can be expressed in a concise way in Kotlin.

The familiar if is now an expression with a return value.

The when expression is analogous to switch in Java but is more powerful.

You don't have to cast a variable explicitly after checking it has a certain type:

the compiler casts it for you automatically using a smart cast.

The for, while, and do-while loops are similar to their counterparts in Java, but

the for loop is now more convenient, especially when you need to iterate over a map or a collection with an index.

The The concise syntax 1..5 (and 1..<5) creates a range. Ranges and progressions allow

Kotlin to use a uniform syntax and set of abstractions in for loops and also work with the in and ! in operators, which check whether a value belongs to a range.

Exception handling in Kotlin is very similar to Java, except Kotlin doesn't require you to declare the exceptions that can be thrown by a function.