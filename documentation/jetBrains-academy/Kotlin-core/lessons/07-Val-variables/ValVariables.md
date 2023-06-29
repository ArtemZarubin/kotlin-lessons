# Val Variables and Constants in Kotlin
In Kotlin, there are scenarios where you need to use variables that should not be modified during program execution. These variables are known as constants or **val** variables. Unlike **var** variables, the value of a **val** variable cannot be changed once it is assigned.

## Val Variables
The following code demonstrates the usage of **val** variables. We declare two **val** variables: **pi**, representing a well-known mathematical constant, and **helloMsg**, representing a string text.

```kotlin
val pi = 3.1415
val helloMsg = "Hello"

println(pi)       // 3.1415
println(helloMsg) // Hello
```
Both variables cannot be modified, but their values can be accessed as needed.

If an attempt is made to modify the value of a **val** variable, the compiler will produce an error stating "Val cannot be reassigned." For example:

```kotlin
val pi = 3.1415
pi = 3.1416 // error: Val cannot be reassigned
```
Similarly, if a **val** variable is used before it is assigned a value, the compiler will generate an error indicating that the variable must be initialized. For instance:

```kotlin
val boolFalse: Boolean
println(boolFalse) // error: Variable 'boolFalse' must be initialized
```
To resolve the error, assign a value to the **val** variable before accessing it:

```kotlin
val boolFalse: Boolean // not initialized
boolFalse = false      // initialized
println(boolFalse)     // no errors here
```
It's important to note that the value of a **val** variable can be assigned to a **var** variable without any restrictions. Additionally, the value of a regular variable can be changed multiple times:

```kotlin
val count = 10
var cnt = count
cnt = 20 // no errors here, cnt is not a constant
```
## Val Variables and Mutability
It's crucial to understand that **val** is not synonymous with immutable. In the following example, we use a **MutableList**, which is an ordered collection of elements of the same type. While reassigning a **val** variable is prohibited, its internal state can still be modified.

```kotlin
val myMutableList = mutableListOf(1, 2, 3, 4, 5)
myMutableList.add(6)   // works
println(myMutableList) // [1, 2, 3, 4, 5, 6]
```
In the code above, the internal state of **myMutableList** is changed by adding another integer element. Although the variable itself cannot be reassigned, the content it represents can be modified.

If you are familiar with the Java programming language, you can think of Kotlin **val** variables as Java **final** variables. Both prohibit reassigning a value to the variable but allow changing the internal state of the object.

## Const Variables
In Kotlin, the **const** modifier is used with the **val** keyword to declare compile-time constants. The value of a **const** variable is known at compile time and cannot be changed at runtime.

```kotlin
const val MY_STRING = "This is a constant string"
```
Attempting to assign a non-constant value to a **const** variable will result in an error. For example:

```kotlin
const val MY_STRING = readln() // error: not a constant String!!!
```
There are certain restrictions on when the **const** modifier can be applied. It can only be used with a **String** or a primitive type variable. Additionally, **const** variables need to be declared at the top level, outside of any functions.

```kotlin
const val CONST_INT = 127
const val CONST_DOUBLE = 3.14
const val CONST_CHAR = 'c'
const val CONST_STRING = "I am constant"
const val CONST_ARRAY = arrayOf(1, 2, 3) // error: only primitives and strings are allowed

// ...

fun main() {
const val MY_INT_2 = 2048 // error: Modifier 'const' is not applicable to 'local variable'
}
```
## When to Use Val Variables
It is considered good practice to use **val** variables by default and only change them to **var** variables when necessary. This approach minimizes the number of mutable variables and reduces the likelihood of errors.

```kotlin
var a = 1024
val b = 256
val c = 128
a += b * c
```
By following this practice, you can write more reliable programs with fewer mutable variables.

## Conclusion
In Kotlin, constant variables are declared using the **val** keyword. While **val** variables cannot be reassigned, their internal state can still be modified. Additionally, the **const** modifier is used to declare compile-time constants. Using **val** variables whenever possible is recommended to avoid errors and promote code stability.