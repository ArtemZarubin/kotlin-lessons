# Classification and Properties of Basic Types in Kotlin
In this topic, we will learn about the classification and properties of basic types in Kotlin. You may already be familiar with some of them. Basic types can be categorized into different groups based on their meaning. Types within the same group operate similarly but have different sizes, which in turn represent different ranges of values.

## Numbers
Kotlin provides several types for handling integers and fractional numbers.

Integer numbers (0, 1, 2, etc.) are represented by the following four types: **Long**, **Int**, **Short**, and **Byte**, arranged from the largest to the smallest. These types have varying sizes and can represent different ranges of values. The range for an integer type can be calculated as **-2^(n-1)** to **2^(n-1)-1**, where **n** is the number of bits. The range includes 0, which is why we subtract 1 from the upper bound.

- Byte: 8 bits (1 byte), range varies from -128 to 127.
- Short: 16 bits (2 bytes), range varies from -32768 to 32767.
- Int: 32 bits (4 bytes), range varies from -2,147,483,648 to 2,147,483,647.
- Long: 64 bits (8 bytes), range varies from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
The size of these types cannot be changed and is independent of the operating system or hardware.

The most commonly used integer types are **Int** and **Long**. It is recommended to use **Int** whenever possible. If you need a larger range for your numbers, you can use **Long**. Here are some examples:

```kotlin
val zero = 0 // Int
val one = 1 // Int
val oneMillion = 1_000_000 // Int

val twoMillion = 2_000_000L // Long (tagged with L)
val bigNumber = 1_000_000_000_000_000 // Long (automatically chosen by Kotlin, as Int is too small)
val ten: Long = 10 // Long (type explicitly specified)

val shortNumber: Short = 15 // Short (type explicitly specified)
val byteNumber: Byte = 15 // Byte (type explicitly specified)
```
Floating-point types are used to represent numbers with fractional parts. Kotlin provides two types for floating-point numbers: **Double** (64 bits) and **Float** (32 bits). These types can store only a limited number of decimal digits (~6-7 for **Float** and ~14-16 for **Double**). In practice, the **Double** type is more commonly used:

```kotlin
val pi = 3.1415 // Double
val e = 2.71828f // Float (tagged with f)
val fraction: Float = 1.51f // Float (type explicitly 
```
To display the maximum and minimum values of a numeric type (including **Double** and **Float**), you can use the following syntax: **<Type>.MIN_VALUE** and **<Type>.MAX_VALUE**:

```kotlin
println(Int.MIN_VALUE) // -2147483648
println(Int.MAX_VALUE) // 2147483647
println(Long.MIN_VALUE) // -9223372036854775808
println(Long.MAX_VALUE) // 9223372036854775807
```
You can also obtain the size of an integer type in bytes or bits (1 byte = 8 bits):

```kotlin
println(Int.SIZE_BYTES) // 4
println(Int.SIZE_BITS) // 32
```
## Characters
Kotlin introduces the **Char** type to represent various letter characters (uppercase and lowercase), digits, and other symbols. Each character is enclosed in single quotes. The size of a **Char** is similar to that of the **Short** type (2 bytes = 16 bits):

```kotlin
val lowerCaseLetter = 'a'
val upperCaseLetter = 'Q'
val number = '1'
val space = ' '
val dollar = '$'
```
Characters in Kotlin can represent symbols from various alphabets, including hieroglyphs and some special symbols, which we will cover later.

## Booleans
Kotlin provides a type called **Boolean**. It can store only two values: **true** and **false**. While it represents only one bit of information, its precise size is not defined.

```kotlin
val enabled = true
val bugFound = false
```
The **Boolean** type is often used in conditionals.

## Strings
The **String** type represents a sequence of characters enclosed in double quotes. It is one of the most commonly used types:

```kotlin
val creditCardNumber = "1234 5678 9012 3456"
val message = "Learn Kotlin instead of Java."
```
## Conclusion
In this topic, we have discussed the most common types in Kotlin: **String**, **Int**, **Long**, **Boolean**, **Char**, and **Double**. We will cover other data types in later topics. Remember, Long is the largest integer type available. Understanding the sizes and ranges of integer types can be beneficial during job interviews or when working with numeric data.