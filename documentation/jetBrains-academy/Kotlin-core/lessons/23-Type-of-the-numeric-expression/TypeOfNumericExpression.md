# Type of the Numeric Expression
In Kotlin, the type of a numeric expression is determined based on the types of the operands involved. In certain cases, type coercion, also known as type casting, is performed by the compiler to automatically set the appropriate types for the components and the result of the expression. This ensures that there is no loss of information during calculations.

## Type Coercion
Type coercion occurs when the compiler infers the type of the result based on the context of the expression. It is important to note that type coercion is rare in Kotlin and primarily applies to numbers and strings.

The diagram below illustrates the direction of type coercion, moving from types with narrower ranges (such as Byte and Short) to wider types (such as Double):

![True or False](https://github.com/ArtemZarubin/kotlin-lessons/blob/master/src/main/images/type2.png)

Since the result type is wider than the previous type, no information is lost during the type coercion process.

## Examples
Let's look at some examples to understand how type coercion works in practice:

### From Int to Long
```kotlin
val num: Int = 100
val longNum: Long = 1000
val result = num + longNum // 1100, Long
```
In this example, the variables **num** and **longNum** have different types (Int and Long, respectively). When they are added together, the result is automatically cast to Long. If you try to declare **result** as an Int, it will result in an error because a Long value cannot be assigned to an Int variable.

### From Long to Double
```kotlin
val bigNum: Long = 100000
val doubleNum: Double = 0.0
val bigFraction = bigNum - doubleNum // 100000.0, Double
```
Here, the variable **bigNum** is of type **Long**, and doubleNum is of type Double. When performing the subtraction operation, the result is automatically cast to Double.

### Short and Byte Types
When working with Short and Byte types, the result of an expression involving these types is automatically cast to Int:

Byte and Byte
```kotlin
val one: Byte = 1
val two: Byte = 2
val three = one + two // 3, Int
```
In this example, the variables **one** and **two** are of type Byte. The addition operation results in an Int value.

Short and Short
```kotlin
val fourteen: Short = 14
val ten: Short = 10
val four = fourteen - ten // 4, Int
```
In this case, the variables **fourteen** and **ten** are of type Short. The subtraction operation produces an Int result.

Short and Byte
```kotlin
val hundred: Short = 100
val five: Byte = 5
val zero = hundred % five // 0, Int
```
Here, the variable **hundred** is of type Short, and **five** is of type Byte. The modulus operation yields an Int result.

To obtain a Byte result when summing two Byte variables, manual type conversion is required:

```kotlin
val one: Byte = 1
val five: Byte = 5
val six = (one + five).toByte() // 6, Byte
```
In this example, the sum of **one** and **five** is explicitly cast to Byte using the **toByte()** function.

Remember that a Byte can store values within the range -128 to 127.

## Conclusion
To summarize, when dealing with expressions involving different numeric types, the following rules can help determine the type of the result:

- If either operand is of type Double, the result is Double.
- Otherwise, if either operand is of type Float, the result is Float.
- Otherwise, if either operand is of type Long, the result is Long.
- Otherwise, the result is Int.

It's important to note that type coercion does not occur when assigning a value to a variable. For example, **val longValue: Long = 10.toInt()** is incorrect because 10 is an Int, and **longValue** requires a Long type.

The Kotlin compiler automatically deduces the type of an expression, which eliminates the need for explicit type conversion in simple cases. However, it is essential to understand how type coercion works to avoid confusion and potential errors.