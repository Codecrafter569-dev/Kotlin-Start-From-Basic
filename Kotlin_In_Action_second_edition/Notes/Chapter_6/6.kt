Summary
Instead of manually iterating over elements in a collection, most common oper-
ations can be performed by combining existing functions from the standard
library with your own lambdas. Kotlin comes with a wide variety of such functions.

The filter and map functions form the basis for manipulating collections and
make it easy to extract elements that match a certain predicate or transform ele-
ments into a new form.

The reduce and fold operations aggregate information from a collection, helping
you compute a single value given a collection of items.

Functions from the associate and groupBy families help you turn flat lists into
maps, so you can structure your data by your own criteria.

For data in collections that is related by its indices, the chunked, windowed, and
zip functions make it possible to create subgroups of collection elements or
merge together multiple collections.

Using predicates, lambda functions that return Boolean, the all, any, none, and
other sibling functions allow you to check whether certain invariants apply to
your collections.

To deal with nested collections, the flatten function can help you extract the
nested items, while the flatMap function even makes it possible to perform a
transformation in the same step.

Sequences allow you to combine multiple operations on a collection lazily and
without creating collections to hold intermediate results, making your code
more efficient. You can use the same functions you use for collections to manip-
ulate sequences. 