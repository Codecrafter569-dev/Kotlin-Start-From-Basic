Summary
Lambdas allow you to pass chunks of code as arguments to functions, so you
can easily extract common code structures.

Kotlin lets you pass lambdas to functions outside of parentheses to make your
code clean and concise.

If a lambda only takes a single parameter, you can refer to it with its implicit
name it. This saves you the effort of explicitly naming the only lambda parame-
ter in short and simple lambdas.


Lambdas can capture external variables. That means you can, for example, use
your lambdas to access and modify variables in the function containing the call
to the lambda.

You can create references to methods, constructors, and properties by prefixing
the name of the function with ::. You can pass such references to functions
instead of lambdas as a shorthand.

To implement interfaces with a single abstract method (aka SAM interfaces),
you can simply pass lambdas instead of creating an object implementing the
interface explicitly.

Lambdas with receivers are lambdas that allow you to directly call methods on a
special receiver object. Because the body of these lambdas is executed in a dif-
ferent context than the surrounding code, they can help with structuring your
code.

The with standard library function allows you to call multiple methods on the
same object without repeating the reference to the object. apply lets you con-
struct and initialize any object, using a builder-style API. also lets you perform
additional actions with an object. 