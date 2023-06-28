# Conversion between Numeric Types
The three most common numeric types in Kotlin are **Int**, **Long**, and **Double**. Sometimes, you may need to assign a value of one numeric type to a variable of another numeric type. In such cases, you need to perform type conversion by invoking specific functions like **toInt()**, **toLong()**, **toDouble()**, and so on.

Let's imagine you have a variable called **num**, which is of type **Int**. You want to pass this variable to a function called **sqrt** that calculates the square root of a number. However, this function requires a **Double** value instead of **Int**. To prevent a type mismatch error, you can convert it using **toDouble()**:

```kotlin
val num: Int = 100

val res: Double = sqrt(num.toDouble())
println(res) // 10.0

println(num) // 100, it remains unchanged
```
In the above example, the variable types are explicitly specified for clarity.

Note that **toDouble()** doesn't modify the type of the variable. Instead, it produces a new value of type **Double**.

Kotlin allows you to perform these conversions even when the target type is larger than the source type. For example, you can convert **Int** to **Long**. This distinguishes Kotlin from other programming languages like Java and C#, which require extra actions for assigning numbers of smaller types to variables of larger types.

```kotlin
val num: Int = 100
val bigNum: Long = num.toLong() // 100
```
Although **Char** is not a numeric type, you can convert a number to a character and vice versa based on the character code. The character code corresponds to an integer number, and you can find it in the Unicode table.

```kotlin
val n1: Int = 125
val ch: Char = n1.toChar() // '}'
val n2: Int = ch.code      // 125
```
If you have a value of a floating-point type, such as **Double**, you can convert it to an integer type like **Int** or **Long**:

```kotlin
val d: Double = 12.5
val n: Long = d.toLong() // 12
```
As seen in the example above, the fractional part is simply dropped during the conversion.

You can also convert a number from a larger type to a smaller type (e.g., **Long** or **Double** to **Int**) using the aforementioned conversion functions:

```kotlin
val d: Double = 10.2
val n: Long = 15

val res1: Int = d.toInt() // 10
val res2: Int = n.toInt() // 15
```
However, be cautious when performing this conversion, as it may truncate the value. Long and Double can store numbers larger than the truncated Int number. This problem is known as type overflow. The same issue may occur when converting Int to Short or Byte. If you intend to convert a larger type value into a smaller one, ensure that truncation won't cause issues in your program.

## Conversion to Short and Byte Types
**Short** and **Byte** types have smaller ranges. They are rarely used, and it's recommended to use **Int** when storing integer numbers. However, if you need to convert something to **Short** or **Byte**, it's important to note that since Kotlin 1.4, you should avoid using the **toShort()** and **toByte()** functions for converting **Double** or **Float** types. This feature will be removed in future releases. The main issue is that such conversion can lead to unexpected results due to the smaller size of the target variable. Instead, convert **Double** or **Float** to **Int** first, and then convert the result to **Short** or **Byte**:

```kotlin
val floatNumber = 10f
val doubleNumber = 1.0

val shortNumber = floatNumber.toInt().toShort() // correct way
val byteNumber = doubleNumber.toInt().toByte()  // correct way
```
## String Conversion
Sometimes you need to obtain a string representation of a value of a different type. Kotlin provides the **toString()** function for this purpose, which can convert a value of any type to a string.

```kotlin
val n = 8     // Int
val d = 10.09 // Double
val c = '@'   // Char
val b = true  // Boolean

val s1 = n.toString() // "8"
val s2 = d.toString() // "10.09"
val s3 = c.toString() // "@"
val s4 = b.toString() // "true"
```
A string can be converted to a number or a boolean value, but it cannot be converted to a single character.

```kotlin
val n = "8".toInt()            // Int
val d = "10.09".toDouble()     // Double
val b = "true".toBoolean()     // Boolean
```
If a string representation has an invalid format, it will result in an error. The program will halt unless special actions are taken, which we'll discuss later.

However, converting a string to a boolean value won't cause errors. If the string is "true" (case-insensitive), it will produce **true**, otherwise **false**.

```kotlin
val b1 = "false".toBoolean()  // false
val b2 = "tru".toBoolean()    // false
val b3 = "true".toBoolean()   // true
val b4 = "TRUE".toBoolean()   // true
```
## Demonstration
The program below demonstrates the discussed functions. It reads a string representation of a number, converts it to several other types, and then prints the results of all conversions.

```kotlin
fun main() {
val something = readln()

    val d = something.toDouble()
    val f = d.toFloat()
    val i = f.toInt()
    val b = i.toByte()

    println(d)
    println(f)
    println(i)
    println(b)
    println(something.toBoolean())
}
```
Imagine we have the following input:

```kotlin
1000.0123456789
```

The program will output:

```kotlin
1000.0123456789
1000.0123
1000
-24
false
```

Let's examine the output. The number represented by the string is successfully converted to **Double**, as it has a suitable format. This number can be safely stored as a **Double**. Then the number is converted to **Float**, resulting in a loss of precision since **Float** can store fewer decimal numbers. The conversion to **Int** cuts off the fractional part. The number 1000 is larger than what **Byte** can store (-128 to 127), resulting in a type overflow (-24). The result of converting the input string to **Boolean** is **false** because the value is not "true".

## Conclusion
In this lesson, we discussed the principles of conversion between basic data types in Kotlin. We covered two main types of conversion: numeric and string. Numeric conversion is useful when you need to convert values between different numeric types. Kotlin allows you to convert numerics even if the target and source types have different sizes by using special functions such as **toInt()**, **toLong()**, and **toDouble()**. String conversion is handy when you need to obtain a string representation of a value, which can be achieved using the **toString()** function. You can convert a value of any type to a string.