# Reading data with readln

In this topic, you will learn how to read information from user input and interact with it. You'll explore how to manage variables using the `readln()` function and work with different data types.

## Standard input

Standard input is a stream of data that goes into a program. It is supported by the operating system and, by default, obtains data from the keyboard. However, it is also possible to get input from a file.

Although not all programs require standard input, you'll frequently encounter situations where it's needed. The typical approach to solving programming problems involves:

1. Reading data from standard input.
2. Processing the data to obtain a result.
3. Outputting the result to standard output.

Before writing programs that perform useful tasks, it's important to understand how to read data from standard input.

## Using readln

In Kotlin, you can use the `readln()` function to read data from standard input. This function reads the entire line as a string:

```kotlin
val line = readln()
```
The variable line has the type String because readln() returns a value of that type.

In older versions of Kotlin, you may need to use readLine()!! instead of readln(). These functions do the same thing, but readln() is shorter and preferred. If you're using Kotlin 1.6 or higher, use readln().

```kotlin
val line = readLine()!! // before Kotlin 1.6
```
Note the exclamation marks. This construction ensures non-empty input to the compiler. We'll discuss it in more detail later.

Here's a simple program that reads a line from standard input and outputs it to standard output:

```kotlin
fun main() {
val line = readln()
println(line)
}
```
For example, if the input is "Hello, Kotlin", the output will be the same:

```yaml
Hello, Kotlin
```
By default, you need to press Enter to see the input information.

Now, let's explore how to read different types of data using **readln()**.

## toInt() and toLong()
Sometimes you need to read numeric data from the user, such as their age or graduation year. To work with numeric values, you can use the **toInt()** function. To convert the input to an integer, use the **toInt()** function with dot syntax:

```kotlin
println("Enter any number: ")
val number = readln().toInt()
print("You entered the number: ")
print(number)
```
For example, if the input is "56", the output will be:

```csharp
Enter any number:
56
You entered the number: 56
```
If you need to process larger numbers, like the cost of a luxury yacht, you can use the **toLong()** function:

```kotlin
println("How much is your yacht worth?")
val cost = readln().toLong()
print("You entered: ")
print(cost)
```
For example, if the input is "10000000000", the output will be:

```csharp
How much is your yacht worth?
10000000000
You entered: 10000000000
```
## toDouble() and toBoolean()
What if you need more precise values? For example, if you need to know the exact price of a liter of gasoline. In this case, you can't use **toInt()** or **toLong()** because the value might not be a whole number. Instead, you can use the **toDouble()** function:

```kotlin
println("Enter any double type number:")
val number = readln().toDouble()
println("You entered the number: ")
print(number)
```
For example, if the input is "0.5673421", the output will be:

```arduino
Enter any double type number:
0.5673421
You entered the number: 0.5673421
```
The same logic applies to Boolean values. You can use the **toBoolean()** function:

```kotlin
println("The earth is flat. Type true or false:")
val answer = readln().toBoolean()
print("The earth is flat: ")
print(answer)
```
For example, if the input is "false", the output will be:

```csharp
The earth is flat. Type true or false:
false
The earth is flat: false
```
## Multiple inputs
Is it possible to receive and process multiple inputs? Yes, it is. You can declare multiple variables and assign them the value of the **readln()** function. If you want to enter several values with different data types, you need to press Enter to separate them.

Here's an example that demonstrates multiple inputs and outputs:

```kotlin
val a = readln()
val b = readln().toInt()
val c = readln()
print(a)
print(" ")
print(b)
print(" ")
print(c)
```
For example, if the inputs are "You earned", "100", and "points!", the output will be:

```yaml
You earned 100 points!
```
As you can see, handling multiple values of different data types is straightforward. You just need to declare multiple variables, assign them the desired **readln()** function, and display them correctly in the console.

## Reading multiple values in one line
If you need to read two values on the same line, you can use the following construction:

```kotlin
val (a, b) = readln().split(" ")
println(a)
println(b)
```
For example, if the input is "Hello, Kotlin", the output will be:

```yaml
Hello,
Kotlin
```
This construction splits the input string at spaces and stores the words in the variables **a** and **b**. We'll discuss this in more detail later.

Similarly, you can read up to four values per line:

```kotlin
val (a, b, c, d) = readln().split(" ")
println(a)
println(b)
println(c)
println(d)
```
For example, if the input is "Have a nice Kotlin", the output will be:

```yaml
Have
a
nice
Kotlin
```
## Conclusion
As you can see, reading input is straightforward in Kotlin. All you need to do is declare a variable with the value of the **readln()** function. The **readln()** function automatically converts the input to a **String** type. Your program can handle string, number, and boolean input by using type conversion with functions such as **toInt()**, **toLong()**, **toDouble()**, and **toBoolean()**. You can also handle multiple values of the same or different types.