# Arithmetic Operations
Arithmetic operations are an essential part of our daily lives, and computers can assist us in performing these calculations. In Kotlin, you have access to various arithmetic operators to manipulate numerical values.

## Binary Operators
Kotlin provides five binary arithmetic operators:

- **Addition (+)**: Adds two values.
- **Subtraction (-)**: Subtracts the second value from the first.
- **Multiplication (*)**: Multiplies two values.
- **Integer Division (/)**: Divides the first value by the second, discarding any fractional part.
- **Modulus (%)**: Returns the remainder of the integer division.

Here are examples illustrating the usage of these operators:

```kotlin
println(13 + 25) // Prints 38
println(70 - 30) // Prints 40
println(21 * 3)  // Prints 63
println(8 / 3)   // Prints 2
println(10 % 3)  // Prints 1
```
Note that integer division truncates any fractional part, and the modulus operator calculates the remainder.

## Complex Expressions
You can combine arithmetic operations to create complex expressions. The calculation order follows the rules of arithmetic:

```kotlin
println(1 + 3 * 4 - 2)    // Prints 11
println((1 + 3) * (4 - 2)) // Prints 8
```
Multiplication takes precedence over addition and subtraction, but you can use parentheses to specify the order of execution.

## Unary Operators
Kotlin also includes unary operators that operate on a single value:

- **Unary Plus**: Represents a value as positive (optional).
- **Unary Minus**: Negates a value or expression.

Here are examples demonstrating unary operators:

```kotlin
println(+5)       // Prints 5
println(-8)       // Prints -8
println(-(100 + 4)) // Prints -104
```
Unary operators have a higher precedence than multiplication and division operators.

## Precedence Order
The arithmetic operators in Kotlin follow a specific precedence order. Here's the order from highest to lowest:

1. Parentheses (to group expressions)
2. Unary Plus and Unary Minus
3. Multiplication, Division, and Modulus
4. Addition and Subtraction

Remembering the acronym BODMAS (Brackets, Order, Division, Multiplication, Addition, Subtraction) can help you recall the order of operations.

## Conclusion
In this lesson, we explored the five main arithmetic operators in Kotlin: addition, subtraction, multiplication, integer division, and modulus. We learned how to combine them into complex expressions, utilize unary operators, and consider the precedence order. Understanding these concepts will empower you to perform arithmetic calculations effectively in Kotlin.