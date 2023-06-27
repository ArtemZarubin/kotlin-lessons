# Exercise: Variable declaration

## Instructions

Explicitly declare the correct type for each variable:

```kotlin
fun main() {
    val a = 1000
    val b = "log message"
    val c = 3.14
    val d = 100_000_000_000_000
    val e = false
    val f = '\n'
}
```
## Solution
```kotlin
fun main() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}
```
The code represents the declaration of variables with explicitly specified types and assignment of corresponding values. Here's an explanation of the code execution:

- Variable **a** is declared with the type **Int** and assigned the value **1000**.
- Variable **b** is declared with the type **String** and assigned the value "**log message**".
- Variable **c** is declared with the type **Double** and assigned the value **3.14**.
- Variable **d** is declared with the type **Long** and assigned the value **100_000_000_000**. Note that the underscore character is used in the number for improved readability.
- Variable **e** is declared with the type **Boolean** and assigned the value false.
- Variable **f** is declared with the type **Char** and assigned the value '**\n**', which represents the newline character.
As a result of executing this code, all variables will be declared with explicitly specified types and their corresponding values. This provides the compiler with information about the data types that can be used and supported for each variable.

Good luck!