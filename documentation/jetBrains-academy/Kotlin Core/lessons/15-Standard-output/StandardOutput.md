# Standard output
Standard output is the basic operation that displays information on a device. Not every program generates such output. By default, the standard output displays the data on the screen, but it is possible to redirect it to a file.

On Hyperskill, you will often write programs that send data, for example, strings and numbers, to the standard output.

## Printing text
Kotlin has two functions that send data to the standard output: **println** and **print**.

The **println** function (print line) displays a string followed by a new line on the screen. For example, the code snippet below prints four lines:

```kotlin
println("I")
println("know")
println("Kotlin")
println("well.")
```
Output:

```css
I
know
Kotlin
well.
```
As you can see, all strings are printed without double quotes.

You can also print an empty line:

```kotlin
println("Kotlin is a modern programming language.")
println() // prints an empty line
println("It is used all over the world!")
```
Output:

```python
Kotlin is a modern programming language.

It is used all over the world!
```
The **print** function displays a value and places the cursor after. Let's look at the example below. This piece of code outputs all strings in a single line:

```kotlin
print("I ")
print("know ")
print("Kotlin ")
print("well.")
```
Output:

```css
I know Kotlin well.
```
## Printing numbers and characters
With **println** and **print** functions, a program can print not only strings but also numbers and characters.

Let's print two secret codes:

```kotlin
print(108)   // prints a number
print('c')   // prints a character
print("Q")   // prints a string
println('3') // prints a character that represents a digit

print(22)
print('E')
print(8)
println('1')
```
Output:

```kotlin
108cQ3
22E81
```

Just like with strings, there are no quotes.

## Conclusion
In this topic, we have covered two basic functions to redirect information to the standard output: **println** and **print**. **println** prints information followed by a new line, while **print** outputs them one after another. Remember, we can use these functions to output not only strings but also any other characters as well.




