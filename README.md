# Scala concepts

* [Function literals](src/main/scala/FunctionLiterals.scala)
Function literal like (x: Int, y: Int) => x + y is an object which implements Function traits with method called apply.

* [Generic function](src/main/scala/GenericFunction.scala)
Polymorphic or generic functions abstract over the type and there are type parameters surrounded by square brackets.

* [Higher order functions](src/main/scala/Hof.scala)
Higher order function satisfies at least one -
1. Takes functions as arguments(one or more).
2. Returns function as result.

* [Tail recursion](src/main/scala/TailRecursion.scala)
Salient things about Tail Recursion in Scala -
1. Recursive call is the only thing at the tail end or last line of function.
2. Scala can compile the tail calls to iteration.

* [Exception Handling](src/main/scala/Exceptions.scala)
Exceptions -
1. Exceptions break referential transparency.
2. Exceptions are not type-safe i.e. doesn't tell the caller of function whether exceptions may occur or how to handle.

Scala way of dealing with exceptions -
1. Option data type is one of dealing with exceptions which is used to represent that a function doesn't have an answer always.
2. Either data type is a disjoint union of two types to indicate success or failure where by convention Right is used for 
   success case and Left is used for failure. It provides more information than Option. Equivalent of this function is 
   Try which provides either Exception or value.

