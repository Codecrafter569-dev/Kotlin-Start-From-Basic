Summary
Function types allow you to declare a variable, parameter, or function return
value that holds a reference to a function.

Higher-order functions take other functions as arguments or return them. You
can create such functions by using a function type as the type of a function
parameter or return value.


When an inline function is compiled, its bytecode, along with the bytecode of a
lambda passed to it, is inserted directly into the code of the calling function.
This ensures the call happens with no overhead compared to similar code writ-
ten directly.


Higher-order functions facilitate code reuse within the parts of a single compo-
nent and enable you to build powerful generic and general-purpose libraries.

Inline functions allow you to use non-local returns—return expressions placed in
a lambda that return from the enclosing function.


Anonymous functions provide an alternative syntax to lambda expressions with
different rules for resolving the return expressions. You can use them if you
need to write a block of code with multiple exit points. 