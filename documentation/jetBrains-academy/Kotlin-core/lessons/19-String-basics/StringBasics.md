# String Basics
In this lesson, we will explore the basics of working with strings in Kotlin. Strings are a fundamental data type in Kotlin and are used to represent sequences of characters. Understanding string operations and manipulations is essential for various programming tasks. Let's dive into the important concepts related to strings.

## The Length of a String
To determine the length of a string, you can use the **.length** property. It returns the number of characters in the string. Here's an example:

```kotlin
val language = "Kotlin"
println(language.length) // Output: 6

val empty = ""
println(empty.length) // Output: 0
```
In the above example, **language.length** returns **6** since the string "**Kotlin**" consists of six characters. Similarly, **empty.length** returns **0** as the empty string has no characters.

## Concatenating Strings
Concatenation is the process of combining two or more strings into a single string. In Kotlin, you can use the **+** operator to concatenate strings. Here's an example:

```kotlin
val str1 = "ab"
val str2 = "cde"
val result = str1 + str2 // Output: "abcde"
```
In the above example, the strings "**ab**" and "**cde**" are concatenated using the **+** operator, resulting in the string "**abcde**".

You can also concatenate multiple strings in the same expression:

```kotlin
val firstName = "John"
val lastName = "Smith"
val fullName = firstName + " " + lastName
```
In the above example, the strings "**John**", **" "**, and "**Smith**" are concatenated to form the full name "**John Smith**".

## Appending Values to Strings
You can append values of different types to a string using the **+** operator. The values are automatically converted to strings and then concatenated to the target string. Here's an example:

```kotlin
val stringPlusBoolean = "abc" + 10 + true
println(stringPlusBoolean) // Output: abc10true

val code = "123" + 456 + "789"
println(code) // Output: 123456789
```
In the above example, the integer **10** and the boolean value true are appended to the string "**abc**". Similarly, the integer **456** is appended between the strings "**123**" and "**789**".

It's important to note that the concatenation operation is not commutative. The order of concatenation matters. For example:

```kotlin
val one = "1"
val two = "2"
val twelve = one + two
println(twelve) // Output: 12
```
In the above example, **one** + **two** concatenates the strings in the order they appear, resulting in the string "**12**".

## Repeating the String
![To do](https://github.com/ArtemZarubin/kotlin-lessons/blob/master/src/main/images/todo.png)

If you need to repeat a string multiple times, you can use the **repeat()** function. It takes an integer argument specifying the number of repetitions. Here's an example:

```kotlin
print("Hello".repeat(4)) // Output: HelloHelloHelloHello
```
In the above example, the string "**Hello**" is repeated four times using the **repeat()** function, resulting in the output "**HelloHelloHelloHello**".

## Raw String
In some cases, you may need to include special characters like tabs or quotes in a string. To make it easier to write such strings, Kotlin provides raw strings. Raw strings can contain newlines and any other characters without the need for escape sequences. To define a raw string, enclose the text in triple quotes (**"""**). Here's an example:

```kotlin
val largeString = """
This is the house that Jack built.

    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
""".trimIndent()
print(largeString)
```
In the above example, the raw string contains multiple lines and preserves the indentation. The **trimIndent()** function is used to remove the common minimal indent and trim the leading and trailing empty lines.

## Conclusion
In this lesson, we covered the basic operations and concepts related to strings in Kotlin. You learned about finding the length of a string, concatenating strings, appending values, repeating strings, and using raw strings. These foundational string operations are essential for manipulating and working with text in your Kotlin programs. Keep practicing and exploring the vast possibilities that strings offer in your programming journey. Good luck!