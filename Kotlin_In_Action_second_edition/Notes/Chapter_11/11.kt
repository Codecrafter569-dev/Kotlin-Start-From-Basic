Summary
Kotlin’s generics are fairly similar to those in Java: you declare a generic func-
tion or class in the same way.

As in Java, type arguments for generic types only exist at compile time.

You can’t use types with type arguments together with the is operator because
type arguments are erased at run time.


Type parameters of inline functions can be marked as reified, which allows you
to use them at run time to perform is checks and obtain java.lang.Class
instances.

Variance is a way to specify whether one of two generic types with the same base
class and different type arguments is a subtype or a supertype of the other one
when one of the type arguments is the subtype of the other one.

You can declare a class as covariant on a type parameter if the parameter is used
only in out positions.

The opposite is true for contravariant cases: you can declare a class as contravar-
iant on a type parameter if it’s used only in in positions.

The read-only interface List in Kotlin is declared as covariant, which means
List<String> is a subtype of List<Any>.

The function interface is declared as contravariant on its first type parameter
and covariant on its second, which makes (Animal) -> Int a subtype of (Cat) ->
Number.


Kotlin allows you to specify variance both for a generic class as a whole (declaration-
site variance) and for a specific use of a generic type (use-site variance).


The star-projection syntax can be used when the exact type arguments are
unknown or unimportant.


Type aliases allow you to provide alternative or shortened names for types. They
are expanded to their underlying type at compile time. 