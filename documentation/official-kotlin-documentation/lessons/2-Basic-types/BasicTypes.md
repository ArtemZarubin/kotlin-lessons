# Lesson 2: Basic Types and Variable Declarations
In Kotlin, every variable and data structure has a data type, which is important for determining the operations that can be performed on them. Kotlin supports type inference, where the compiler can automatically infer the data type based on the assigned value.

## Basic Types
Kotlin provides several basic types for different kinds of data:

- Integers: **Byte**, **Short**, **Int**, **Long**
- Unsigned Integers: **UByte**, **UShort**, **UInt**, **ULong**
- Floating-point Numbers: **Float**, **Double**
- Booleans: **Boolean**
- Characters: **Char**
- Strings: **String**
For more detailed information about basic types and their properties, refer to the [Kotlin documentation on Basic Types](https://kotlinlang.org/docs/basic-types.html).

## Variable Declarations
Variables can be declared and initialized in Kotlin. If a variable is declared without initialization, its type must be specified using the **:** operator.

```kotlin
// Variable declared without initialization
val d: Int
// Variable initialized
d = 3

// Variable explicitly typed and initialized
val e: String = "hello"
```
Variables must be initialized before the first read, but Kotlin allows for initialization at a later stage.

## Augmented Assignment Operators
Kotlin provides augmented assignment operators (**+=**, **-=**, ***=**, **/=**, **%=**) for performing arithmetic operations and updating the variable in-place.

```kotlin
var players = 5

// Some players leave the game
players = 3

players = players + 1 // Example of addition: 4
players += 5          // Example of addition: 9
players -= 2          // Example of subtraction: 7
players *= 3          // Example of multiplication: 21
players /= 7          // Example of division: 3
```
## Variable Usage
Variables can be used in string interpolation using the **$** symbol:

```kotlin
println("Number of players: $players") // Number of players: 3
println("Integer: $woInit") // Integer: 7620
println("My name is $myNameIs") // My name is Artem Zarubin
```
Now you have a basic understanding of basic types, variable declarations, and augmented assignment operators in Kotlin!