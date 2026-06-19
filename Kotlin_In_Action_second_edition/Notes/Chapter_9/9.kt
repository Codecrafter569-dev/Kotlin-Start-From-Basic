Summary
Kotlin allows you to overload some of the standard mathematical operations by
defining functions with the corresponding names. You can’t define your own
operators, but you can use infix functions as a more expressive alternative.

You can use comparison operators (==, !=, >, <, and so on) with any object. They
are mapped to calls of the equals and compareTo methods.

By defining functions named get, set, and contains, you can support the [] and
in operators to make your class similar to Kotlin collections.

Creating ranges and iterating over collections and arrays also work through
conventions.

Destructuring declarations allow you to initialize multiple variables by unpack-
ing a single object, which is handy for returning multiple values from a func-
tion. They work with data classes automatically, and you can support them for
your own classes by defining functions named componentN.


Delegated properties allow you to reuse logic controlling how property values
are stored, initialized, accessed, and modified, which is a powerful tool for
building frameworks.

The lazy standard library function provides an easy way to implement lazily ini-
tialized properties.

The Delegates.observable function allows you to add an observer of property
changes.

Delegated properties can use any map as a property delegate, providing a flexi-
ble way to work with objects that have variable sets of attributes. 