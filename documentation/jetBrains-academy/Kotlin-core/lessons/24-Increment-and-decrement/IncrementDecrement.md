# Increment and Decrement
In our daily lives, we often perform calculations such as counting steps, calculating expenses, or tracking days until a vacation. Similarly, in programming, arithmetic operations play a vital role. In this lesson, you will learn how to write arithmetic operations in a concise and clear manner.

## Assignment Operations
Kotlin supports basic arithmetic operations like addition and subtraction, as you already know:

```kotlin
var a = 3
a = a + 1 // 4
a = a - 1 // 3
```
In addition to these, there are compound assignment operations that combine arithmetic operations and assignments. These operations utilize the assignment operator = in combination with another operator to avoid repeating the variable name. Here are some examples:

- **+=** assignment after addition: **A += B** is equivalent to **A = A + B**
- **-=** assignment after subtraction: **A -= B** is equivalent to **A = A - B**
- ***=** assignment after multiplication: **A *= B** is equivalent to **A = A * B**
- **/=** assignment after division: **A /= B** is equivalent to **A = A / B**
- **%=** assignment of the remainder after division: **A %= B** is equivalent to **A = A % B**

Let's see how these assignment operations can be performed on a single variable:

```kotlin
var a = 3
a += 2 // 5
a -= 2 // 3
a *= 2 // 6
a /= 2 // 3
a %= 2 // 1
```
Here, we performed calculations using the number 2 and the variable **a**, and then assigned the results back to **a**. As you can see, these compound assignment operations make the code shorter and clearer.

It's important to note that compound assignment operators can only be used with variables that are already defined and initialized. They cannot be used to declare a new variable:

```kotlin
var a: Int
a += 5 // Compile-time error: Variable 'a' must be initialized
```
## Using Increment and Decrement
Another common operation is incrementing or decrementing a number by one. While you can use **+=** 1 or **-=** 1, Kotlin provides a more concise way to achieve this: increment and decrement operations. Let's take a look at an example:

```kotlin
var num = 3
num++  // 4, increment
num--  // 3, decrement
```
The code above is equivalent to the following:

```kotlin
var num = 3
num += 1  // 4
num -= 1  // 3
```
As you can see, the **++** increment operator accomplishes the same result as **+=** 1, but in a simpler manner. The same applies to the **--** decrement operator.

It's important to note that this shorthand notation works only when increasing or decreasing a number by one.

While it may seem straightforward, increment and decrement operations have some nuances. Both the increment and decrement operators have two forms: prefix and postfix.

## Prefix Form
The prefix form changes the value of a variable before it is used. Let's see some examples:

Prefix increment returns the incremented value:

```kotlin
var a = 10
val b = ++a
println(a)  // a = 11
println(b)  // b = 11
```
In the example above, the value of variable **a** is incremented by one, and then its value is assigned to variable **b**. As a result, both **a** and **b** are 11.

Prefix decrement behaves similarly:

```kotlin
var a = 10
val b = --a
println(a)  // a = 9
println(b)  // b = 9
```
Here, the value of variable **a** is decreased by one, and then its value is assigned to variable **b**.

## Postfix Form
In contrast, the postfix form changes the value of a variable after it is used. Let's see some examples:

Postfix increment returns the value before incrementing by one:

```kotlin
var a = 10
val b = a++
println(a)  // a = 11
println(b)  // b = 10
```
First, the value of variable **a** is assigned to variable **b**, and then the value of **a** is increased by one. As a result, **a** becomes 11, while **b** retains the original value of 10.

Similarly, postfix decrement behaves as follows:

```kotlin
var a = 10
val b = a--
println(a)  // a = 9
println(b)  // b = 10
```

## Order of Precedence
In Kotlin, certain operations take precedence over others, meaning they are performed first. Here is the list of operations in decreasing order of priority:

1. Parentheses ((expr))
2. Postfix increment/decrement (expr++, expr--)
3. Unary plus/minus, prefix increment/decrement (-expr, ++expr, --expr)
4. Multiplication, division, and modulus (*, /, %)
5. Addition and subtraction (+, -)
6. Assignment operations (=, +=, -=, *=, /=, %=)
It's important to consider the order of precedence when evaluating arithmetic expressions. For example:

```kotlin
val a = 2
var b = 3
val c = a + 4 * --b  
println(c)   // Result: 10
```
In the code above, the decrement operation **--b** has a higher priority than multiplication and addition. Hence, **--b** is evaluated first. Parentheses can be used to explicitly define the order of operations, ensuring clarity:

```kotlin
var a = 5
val b = 9
val c = 3
val d = a++ + (b / 2) - c - 4
println(d)   // Result: 2
```
## Conclusion
Using assignment operations and increment/decrement operations can make your code shorter and more readable. Remember the distinction between prefix and postfix forms: prefix changes the value of a variable before using it, while postfix changes it after. With this knowledge, you can confidently utilize these operations in Kotlin.