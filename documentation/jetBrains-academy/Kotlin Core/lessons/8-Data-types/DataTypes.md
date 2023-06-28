# What is a data type?
All of us know that a number and a piece of text are pretty different. How do we know this? Well, you can perform arithmetic operations (such as multiplication) on numbers but not on texts. Kotlin also knows it. That's why every variable has a type that determines what possible operations you can perform on this variable and which values you can store in it.

## Variable types
A variable's type is set when the variable is declared:

```kotlin
val text = "Hello, I am studying Kotlin now."
val n = 1
```
In this case, Kotlin knows that **text** is a string and **n** is a number. Kotlin determines the types of both variables automatically. This mechanism is called type **inference**.

Please, take a look at the following piece of code. This is how we declare a variable with type inference:

```kotlin
val/var identifier = initialization
```
You can also specify the type of a variable when declaring it:

```kotlin
val/var identifier: Type = initialization
```
Note, the type name always starts with an uppercase letter.

Let's declare the same variables as in the previous example and specify their types:

```kotlin
val text: String = "Hello, I am studying Kotlin now."
val n: Int = 1
```
The **Int** type means that the variable stores an integer number (0, 1, 2, ..., 100_000_000, ...). The **String** type means that the variable stores a string ("Hello", "John Smith"). Later, you will learn more about these and other data types.

You will see that people use both these forms of variable declaration in practice. When you use type inference, you make your code more concise and readable, but in some cases, it may be better to specify the type. For example, if we need to declare a variable and initialize it later, type inference won't work at all.

```kotlin
val greeting // error
greeting = "hello"
```
The example above is incorrect because Kotlin cannot infer the type of the variable when it is merely declared, while every variable must have a type. On the contrary, the example below does work because the type is specified by the programmer:

```kotlin
val greeting: String // ok
greeting = "hello"
```
## Type mismatch

One of the most important functions of data types is to protect you from assigning an unsuitable value to a variable. Take a look at an example of code that doesn't work:

```kotlin
val n: Int = "abc" // Type mismatch: inferred type is String but Int was expected
```
So, if you see a type mismatch error, it means you've assigned something unsuitable to a variable. The same problem occurs when you try to assign an unsuitable value to a mutable variable declared with type inference.

```kotlin
var age = 30 // the type is inferred as Int
age = "31 years old" // Type mismatch
```
Note, you cannot change the type of a variable.

## Conclusion
Later, we will learn about other data types and some problems associated with them. From now on, remember: once a variable is created, it has a type, and its type cannot be changed later.