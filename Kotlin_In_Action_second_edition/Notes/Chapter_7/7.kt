Summary
Kotlin’s support of nullable types detects possible NullPointerException errors
at compile time.

Regular types are non-nullable by default unless they are explicitly marked as
nullable. A question mark after a type name indicates it is nullable.

Kotlin provides a variety of tools for dealing with nullable types concisely.

Safe calls (?.) allow you to call methods and access properties on nullable
objects.

The Elvis operator (?:) makes it possible to provide a default value for an
expression that may be null, return from execution, or throw an exception.

You can use non-null assertions (!!) to promise the compiler that a given value
is not null (but you will have to expect an exception if you break that promise).

The let scope function turns the object on which it is called into the parameter
for a lambda. Together with the safe-call operator, it effectively converts an
object of nullable type into one of non-nullable type.

The as? operator provides an easy way to cast a value to a type and handle the
case in which it has a different type.