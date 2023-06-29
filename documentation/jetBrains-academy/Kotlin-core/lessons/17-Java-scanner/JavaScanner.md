# Standard input with Java Scanner
When working with standard input, the **readln()** method may not always be sufficient for complex tasks. It is a simple method that may not be suitable for tasks such as finding only integers or doubles in a data flow, reading data sequentially word by word, and controlling the reading process step by step. In such cases, we can use a powerful Java tool called Scanner, which is also compatible with Kotlin.

## What is Java Scanner?
Scanner is a way to obtain data from standard input. It can be accessed directly from Kotlin since it is interoperable with other Java libraries. Scanner allows a program to read values of different types, such as strings, numbers, etc., from the standard input.

To use Scanner, you need to add the following import statement to the top of your source code file:

```kotlin
import java.util.Scanner
```
Alternatively, you can use the wildcard import to import all classes from the **java.util** package:

```kotlin
import java.util.*
```
Both methods will enable you to use the Scanner class in your program. We will discuss importing in more detail later.

Let's create a variable initialized with Scanner:

```kotlin
val scanner = Scanner(System.`in`)
```
In this line, **System.in** represents the standard input stream. The Scanner object wraps it as an internal data source and provides a set of convenient methods to work with the input. While you can useScanner(System.in)directly in your code without creating a separate variable, using a single variable likescanner` is a more convenient and readable approach.

Now we can read data from standard input using various methods provided by Scanner:

```kotlin
val line = scanner.nextLine() // reads a whole line, e.g., "Hello, Kotlin"
val num = scanner.nextInt()   // reads a number, e.g., 123
val string = scanner.next()   // reads a string, e.g., "Hello"
```
The **scanner.next()** method reads only one word, not a whole line. For example, if the user enters "Hello, Kotlin", it will read only "Hello,".

After calling methods like **scanner.nextLine()** or **scanner.nextInt()**, the program will wait for input data. Here are a couple of examples of correct input data:

Example 1:
```kotlin
Hello, Kotlin
123 Hello
```

Example 2:
```kotlin
Hello, Kotlin
123
Hello
```

It is also possible to read a number as a string using **scanner.next()** or **scanner.nextLine()** if the number is on a new line.

Additionally, the Scanner class provides several methods (functions) for reading values of other types. For more details, refer to the Class Scanner documentation.

## Example: Reversing Two Numbers
Let's take a look at an example program that reads two numbers from the input and outputs them in reverse order on two different lines:

```kotlin
import java.util.Scanner

fun main() {
val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    println(num2)
    println(num1)
}
```
In this program, we import the **java.util.Scanner** class, which is a type from the Java standard library. Inside the **main()** function, we create a **scanner** variable that reads data from the standard input.

The program then reads the first number using **scanner.nextInt()** and assigns it to the **num1** variable. Next, it reads the second number using **scanner.nextInt()** and assigns it to the **num2** variable.

Finally, the program prints the second number followed by a new line using **println(num2)**, and then prints the first number followed by a new line using **println(num1)**.

Once we have finished reading the data, we can cancel the Scanner to release any associated resources:

```kotlin
scanner.cancel()
```
By canceling the Scanner, we ensure that it no longer consumes system resources.

## Custom Delimiter
In some cases, we may need to input data directly into the Scanner without relying on whitespaces or new lines as delimiters. For such scenarios, Scanner provides a convenient tool called **useDelimiter()**. This method allows us to customize the delimiters for methods like **next()**, **nextInt()**, etc. (the default delimiter is a whitespace).

For example, let's say we want to read words and integers separately from the input, where the words and integers are separated by an underscore _:

```kotlin
val scanner = Scanner("123_456")
```
To read this data correctly, we can set the delimiter symbol to _ using **scanner.useDelimiter("_")**. Now we can read the integers as follows:

```kotlin
println(scanner.nextInt()) // 123
println(scanner.nextInt()) // 456
```
By customizing the delimiter, we can parse the input according to our specific requirements.

## Checking the Next Element
Suppose we have the following data in our Scanner:

```kotlin
val scanner = Scanner("Hello, Kotlin!")
```
Now, let's try to read several words from it:

```kotlin
val word1 = scanner.next()
val word2 = scanner.next()
val word3 = scanner.next()
```
If we try to read the third word, we will encounter an exception, and our program will crash. To handle such situations, Scanner provides its own method called **hasNext()** (or **hasNextInt()**, etc.).

We can use **hasNext()** to check if there is another element available before attempting to read it. Here's how it can be used:

```kotlin
if (scanner.hasNext()) {
val word1 = scanner.next() // Hello,
}

if (scanner.hasNext()) {
val word2 = scanner.next() // Kotlin!
}

if (scanner.hasNext()) {
val word3 = scanner.next() // It doesn't work but also doesn't cause an error
}
```
With **hasNext()**, we can determine whether there is more data to read and safely handle the input flow.

## Conclusion
In this topic, we explored the Java Scanner as a powerful tool for reading from standard input. It provides a convenient way to handle complex data and filter content. Here are the key takeaways:

- If you don't need the advanced features of Scanner, **readln()** is sufficient for basic input.
- Scanner offers methods like **next()**, **nextInt()**, and **nextLine()** to read different types of data.
- Use the **useDelimiter()** method to handle input with custom delimiters.
- Use the **hasNext()** method to check if there are more elements in the input.

Remember these points when working with standard input and choose the appropriate method based on your needs.