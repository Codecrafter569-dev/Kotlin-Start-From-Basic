Summary
Interfaces in Kotlin are similar to Java’s but can contain default implementa-
tions and properties.

All declarations are final and public, by default.

To make a declaration non-final, mark it as open.

internal declarations are visible in the same module.

Nested classes aren’t inner by default. Use the keyword inner to store a refer-
ence to the outer class.

All direct subclasses of sealed classes and all implementations of sealed inter-
faces need to be known at compile time.

Initializer blocks and secondary constructors provide flexibility for initializing
class instances.

You use the field identifier to reference a property backing field from the
accessor body.

Data classes provide compiler-generated equals, hashCode, toString, copy, and
other methods.

Class delegation helps avoid many similar delegating methods in your code.

Object declaration is Kotlin’s way to define a singleton class.

Companion objects (along with package-level functions and properties) replace
Java’s static method and field definitions.

Companion objects, like other objects, can implement interfaces as well as have
extension functions and properties.

Object expressions are Kotlin’s replacement for Java’s anonymous inner classes,
with added power, such as the ability to implement multiple interfaces and
modify the variables defined in the scope where the object is created.

Inline classes allow you to introduce a layer of type safety to your program while
avoiding potential performance hits caused by allocating many short-lived objects. 