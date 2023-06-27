# Practice
## Exercise: List. Counting Numbers
You have a list of "green" numbers and a list of "red" numbers. Complete the code to print how many numbers there are in total.

```kotlin
fun main() {
val greenNumbers = listOf(1, 4, 23)
val redNumbers = listOf(17, 2)
// Write your code here
}
```
## Example solution:

```kotlin
fun main() {
val greenNumbers = listOf(1, 4, 23)
val redNumbers = listOf(17, 2)
val totalCount = greenNumbers.count() + redNumbers.count()
println(totalCount)
}
```
In this exercise, you are given two lists: **greenNumbers** and **redNumbers**. The task is to determine the total count of numbers in both lists combined.

To solve this, you can use the **count()** function on each list to obtain the count of elements in each list. Then, add the counts together to get the total count. Finally, print the total count using **println()**.
## Exercise: Set. Checking Protocol Support
You have a set of protocols supported by your server. A user requests to use a particular protocol. Complete the program to check whether the requested protocol is supported or not (**isSupported** must be a Boolean value).

```kotlin
fun main() {
val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
val requested = "smtp"
val isSupported = // Write your code here
println("Support for $requested: $isSupported")
}
```
_Hint: Make sure that you check the requested protocol in upper case. You can use the **.uppercase()** function to help you with this._

## Example solution:

```kotlin
fun main() {
val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
val requested = "smtp"
val isSupported = requested.uppercase() in SUPPORTED
println("Support for $requested: $isSupported")
}
```
In this exercise, you have a set called **SUPPORTED** that contains the supported protocols by a server. The user requests to use a particular protocol, which is stored in the **requested** variable. The goal is to check whether the requested protocol is supported or not.

To solve this, you can use the **in** operator to check if the **requested** protocol (converted to uppercase using **uppercase()**) exists in the **SUPPORTED** set. The result should be assigned to the **isSupported** variable. Finally, print the result using **println()**.
## Exercise: Map. Spelling Numbers
Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.

```kotlin
fun main() {
val number2word = // Write your code here
val n = 2
println("$n is spelt as '${<Write your code here >}'")
}
```
## Example solution:

```kotlin
fun main() {
val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
val n = 2
println("$n is spelt as '${number2word[n]}'")
}
```
In this exercise, you need to define a map called **number2word** that relates integer numbers from 1 to 3 to their corresponding spellings. Then, using the defined map, you need to spell a given number **n**.

To solve this, create a map using the **mapOf()** function, where the keys are the integer numbers and the values are their corresponding spellings. For example, **1 to "one"**. Then, retrieve the spelling of the given number **n** from the map using the square bracket indexing (**number2word[n]**). Finally, print the result using **println()**.

Good luck!