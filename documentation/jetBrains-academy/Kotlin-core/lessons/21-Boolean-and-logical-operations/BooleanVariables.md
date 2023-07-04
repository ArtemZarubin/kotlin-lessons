# Boolean and Logical Operations
In this lesson, we will explore boolean values and logical operations in Kotlin. Booleans are fundamental data types that represent two opposite states: true and false. We will learn how to work with boolean variables and utilize logical operators to construct logical statements.

## Boolean Variables
Boolean variables in Kotlin can hold one of two values: true or false. Here's an example:

![Foreign friend](https://github.com/ArtemZarubin/kotlin-lessons/blob/master/src/main/images/true-and-false.svg)

```kotlin
val t = true    // t is true
val f = false   // f is false

println(t)      // true
println(f)      // false
```
Note that you cannot assign an integer value to a boolean variable. In Kotlin, 0 is not equivalent to false.

## Reading Boolean Values
In Kotlin 1.4 and later versions, you can read a boolean value from user input using **readLine().toBoolean()**. For Kotlin 1.6 and newer, you can use **readln().toBoolean()**.

```kotlin
val b: Boolean = readLine().toBoolean()

// Example input:
// true
// Output:
// true
```
The **toBoolean()** function converts the user input to a boolean value. If the input is "true" (case-insensitive), it returns true. Otherwise, it returns false.

## Logical Operators
Kotlin provides four logical operators for working with boolean values:

**NOT**: Reverses the boolean value. Denoted by the **!** operator.
**AND**: Returns true if both operands are true. Denoted by the **&&** operator.
**OR**: Returns true if at least one operand is true. Denoted by the **||** operator.
**XOR** (Exclusive OR): Returns true if the operands have different values. Denoted by the **xor** operator.
Here are examples illustrating the usage of logical operators:

```kotlin
val f = false           // f is false
val t = !f              // t is true (NOT operator)

val b1 = false && false // false (AND operator)
val b2 = false || true  // true (OR operator)
val b3 = true xor false // true (XOR operator)
```
The logical operators allow you to combine boolean values and create complex logical expressions.

## Logical Operator Precedence
Logical operators in Kotlin have a specific order of precedence. Here's the precedence from highest to lowest:

- **!** (NOT)
- **xor** (XOR)
- **&&** (AND)
- **|** (OR)
Parentheses can be used to change the order of execution. For example:

```kotlin
val bool = true && !false  // true (NOT is evaluated first)
```
By understanding the operator precedence, you can control the grouping of variables in logical expressions.

## Conclusion
In this lesson, we explored boolean values and logical operations in Kotlin. We learned about boolean variables, logical operators (NOT, XOR, AND, OR), and the precedence of logical operations. Understanding these concepts is essential for mastering Kotlin programming. Logical operations are powerful tools for making decisions and controlling program flow based on boolean conditions. Practice and experimentation will further solidify your understanding. Now, let's move on to solving some tasks to reinforce your knowledge.