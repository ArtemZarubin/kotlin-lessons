# Integers in Action
## Int and Long Integer Types
Programmers often use integer numbers in their programs. Kotlin provides several integer types, with the most popular ones being **Int** (32 bits) and **Long** (64 bits). You can perform arithmetic operations (+, -, *, /, %) with variables of these types. Let's look at some examples:

```kotlin
val two = 2  // Int
val ten = 10 // Int

val twelve = two + ten // 12
val eight = ten - two  // 8
val twenty = two * ten // 20
val five = ten / two   // 5
val zero = ten % two   // 0, no remainder
```
These examples demonstrate basic arithmetic operations using **Int** variables. You are already familiar with what these operations do. The **Long** type supports the same operations. To declare a variable of type **Long**, you can use one of these approaches:

```kotlin
val longNumber1 = 1_000_000_000_000_000
val longNumber2: Long = 1_000_000
val longNumber3 = 1000L

val result = longNumber1 + longNumber2 - longNumber3
println(result) // 1000000000999000
```
In the example above, **longNumber1** is of type **Long** because its value exceeds the possible value of **Int**. **longNumber2** is explicitly declared as **Long**. **longNumber3** is inferred to be **Long** because we used the **L** suffix to indicate it. The result of the arithmetic operations is also **Long**, as it involves three **Long** integers.

Tip: Use **Long** integers only when necessary, such as when dealing with large values.

Do you notice the underscores **_** in the examples? In Kotlin, underscores can be used to improve the readability of numbers. They can group digits together, making large numbers easier to read. Underscores cannot be placed before or after a number, but they can be placed between digits.

## Reading Numbers from the Standard Input
To solve problems, you often need to read input data, process it, and output the result. For example, the following program reads two numbers from the standard input, performs addition, and prints the sum:

```kotlin
fun main() {
val a = readln().toInt()
val b = readln().toInt()

    val sum = a + b

    println(sum)
}
```
In the code above, **readln()** is used to read data from the input. It works for positive, negative, and zero numbers because the **Int** type supports all of them.

If you know that the input numbers can be large, you can read them as **Long** instead of **Int**:

```kotlin
val a = readln().toLong()
val b = readln().toLong()
```
In this case, you don't need to make any other changes to the code.

## Unsigned Integers
In addition to the signed integer types (Int, Long, Byte, and Short), Kotlin also provides the ability to create unsigned integers, which can only hold non-negative values.

Kotlin offers the following unsigned types:

| Type   | Description                                                                   |
|--------|-------------------------------------------------------------------------------|
| UByte  | Unsigned 8-bit integer, ranges from 0 to 255                                  |
| UShort | Unsigned 16-bit integer, ranges from 0 to 65535                               |
| UInt   | Unsigned 32-bit integer, ranges from 0 to 4,294,967,295 (2^32-1)              |
| ULong  | Unsigned 64-bit integer, ranges from 0 to 18,446,744,073,709,551,615 (2^64-1) |
Unsigned numbers are created in the same way as signed numbers, but you need to add the suffix **u** or **U** to indicate that it is an unsigned number:

```kotlin
val uByte: UByte = 5u
val uShort: UShort = 10U
```
In the above example, variables of specified types are created. If you don't explicitly specify the type, the compiler will use **UInt** or **ULong** based on the size of the literal:

```kotlin
val smallSize = 100u // UInt by default
val bigSize = 5_000_000_000u // ULong because the number doesn't fit in UInt
```
You can also use the suffix **uL** (or **UL**) to ensure an **ULong** is created regardless of the number's size:

```kotlin
val smallLong = 10uL // ULong because it is marked with "uL"
```
## Data Type Overflow
Arithmetic operations for signed types can be performed with their unsigned counterparts, except for the unary minus operation.

Let's look at the results of the following code:

```kotlin
// MAX_VALUE: Int = 2147483647
var d: Int = 2147483647
d += 1
println(d) // -2147483648
```
The result may be unexpected. This situation is called data type overflow. When a variable's value is close to the maximum value of its type, there is a risk that the resulting value won't fit within the allocated memory for the variable. Overflowing a variable's type can lead to data loss, unexpected program behavior, and other issues.

In the example above, variables of type **Int** have a maximum value of **MAX_VALUE: Int = 2147483647**. When we add 1 to this value, the binary representation changes, and the leftmost bit takes the value 1, resulting in a negative number. This behavior is due to the way computers represent signed integers using 1s complement or 2s complement representation.

It's important to remember the following points:

- Data type overflow errors are programmer errors.
- Program behavior in the case of data type overflow is unpredictable.
- The compiler will not warn you about possible data type overflow, so it's crucial to select appropriate data types for variables and carefully handle type transformations.

## Conclusion
In this lesson, we explored two fundamental integer types in Kotlin: **Long** and **Int**. We also learned how to read input data and discussed unsigned integer types. Armed with this knowledge, you now have the skills to write programs that process data. Feel free to use the provided template to solve coding problems in this topic. Remember to use meaningful variable names, as it improves code readability.