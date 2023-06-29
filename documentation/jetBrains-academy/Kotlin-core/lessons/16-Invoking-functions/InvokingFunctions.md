# Invoking functions

## Sometimes, it isn't enough to use readln() to read data from standard input.

As you remember, we have discussed functions before. What is a function, though? How can we use them? A function is a sequence of instructions, and we can invoke it from a program by calling its name. Functions represent subprograms, and they perform some actions, such as printing data to the standard output, calculating a square root, and so on.

The picture below shows how functions work. Basically, it is just a box that processes input arguments (input data) and produces either a useful result or nothing.

![Function](https://github.com/ArtemZarubin/kotlin-lessons/blob/master/src/main/images/Function.svg)

## Functions arguments
When we want to use a function, we can invoke (or call) it using its name followed by parentheses. If a function takes one or more arguments (input data), they should be passed in the parentheses.

In the example below, we invoke the **println** function with a single-string argument:

```kotlin
val text = "Hello"
println(text)
```
This function can also take no arguments at all to print a new line:

```kotlin
println()
```
So, in its general form, a function can be invoked like this:

```kotlin
function1() // invokes function1 without an argument
function2(arg1) // invokes function2 while passing an argument
function3(arg1, arg2) // invokes function3 while passing two arguments
// ... and so on
```
Where **function** is the name of a function.

## Producing a result
Some functions not only take arguments but also produce (return) some results. You can also assign it to a variable:

```kotlin
val result = function(arg)
```
Functions that take arguments and produce a result look like regular math functions.

For example, let's take a look at a math function that returns the absolute value of a number:

```kotlin
val number = -10
val nonNegNumber = Math.abs(number) // it takes -10 and returns 10
```
A benefit of using functions is that you don't need to implement anything; just invoke a function, and it will work.

The name of the **abs** function is written after the dot symbol. The reason is that **Math** groups multiple functions, and we should write the name of the group to invoke one of them. We won't go into detail right now, just keep in mind that you will see something like that in our examples and practice problems.

All functions return a result, even the **println** function.

```kotlin
val result = println("text")
println(result) // kotlin.Unit
```
The result is a special value called Unit, which practically means no result. When your function returns nothing, it means it returns Unit. That's all you need to understand for now. If you're coming from another language like C or Java, you can think of it as **Void**.

## Conclusion
In this topic, we have discussed what a function is and how to invoke standard functions in Kotlin. In the next topic, you'll find out how to declare your own functions and how to use functions written by other programmers.