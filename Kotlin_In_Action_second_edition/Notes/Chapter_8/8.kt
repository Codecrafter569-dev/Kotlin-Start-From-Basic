

*Summery*
Types representing basic numbers (e.g., Int) look and function like regular
classes but are usually compiled to Java primitive types. Kotlin’s unsigned num-
ber classes, which don’t have an exact equivalent on the JVM, are transformed
via inline classes to behave and perform like primitive types.

Nullable primitive types (e.g., Int?) correspond to boxed primitive types in Java
(e.g., java.lang.Integer).

The Any type is a supertype of all other types and is analogous to Java’s Object.
Unit is an analogue of void.

The Nothing type is used as a return type of functions that don’t terminate
normally.

Types coming from Java are interpreted as platform types in Kotlin, allowing
the developer to treat them as either nullable or non-null.

Kotlin uses the standard Java classes for collections and enhances them with a
distinction between read-only and mutable collections.

You must carefully consider nullability and mutability of parameters when you
extend Java classes or implement Java interfaces in Kotlin.


You can use arrays in Kotlin, but it’s generally recommended to prefer collec-
tions by default.


Kotlin’s Array class looks like a regular generic class but is compiled to a Java
array.


Arrays of primitive types are represented by special classes, such as IntArray.