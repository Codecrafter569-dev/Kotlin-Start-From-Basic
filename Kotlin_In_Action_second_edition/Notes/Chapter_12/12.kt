#Summery#

Annotations in Kotlin are applied using the @MyAnnotation(params) syntax.

Kotlin lets you apply annotations to a broad range of targets, including files and
expressions.

An annotation argument can be a primitive value, a string, an enum, a class ref-
erence, an instance of another annotation class, or an array thereof.

Specifying the use-site target for an annotation, as in @get:JvmName, allows you to
choose how the annotation is applied if a single Kotlin declaration produces
multiple bytecode elements.

You declare an annotation class as a class with a primary constructor, where all
parameters are marked as val properties and without a body.

Meta-annotations can be used to specify the target, retention mode, and other
attributes of annotations.

The reflection API allows you to enumerate and access the methods and proper-
ties of an object dynamically at run time. It has interfaces representing different
kinds of declarations, such as classes (KClass), functions (KFunction), and so on.

To obtain a KClass instance, you can use ClassName::class for classes or
objName::class for object instances.

The KFunction and KProperty interfaces both extend KCallable, which provides
the generic call method.

The KCallable.callBy method can be used to invoke methods with default
parameter values.

KFunction0, KFunction1, and so on are functions with different numbers of
parameters that can be called using the invoke method.

KProperty0 and KProperty1 are properties with different numbers of receivers
that support the get method for retrieving the value. KMutableProperty0 and
KMutableProperty1 extend those interfaces to support changing property values
via the set method.

To obtain a run-time representation for a KType, you can use the typeOf<T>()
function. 