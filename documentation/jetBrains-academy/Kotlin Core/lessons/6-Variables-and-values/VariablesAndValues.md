# Variables in Kotlin
In Kotlin, a variable is a storage container that holds a value, which can be a string, a number, or any other data type. Each variable has a unique name, also known as an identifier, to distinguish it from other variables. You can access the value stored in a variable by using its name.

Variables are one of the fundamental elements used in programming, so it's essential to understand how to work with them effectively.

## Declaring Variables
Before using a variable, you need to declare it. Kotlin provides two keywords for variable declaration:

- **val** (short for value) declares an immutable variable, which means it holds a named value that cannot be changed once it is initialized. It can be assigned a value only once during initialization.

- **var** (short for variable) declares a mutable variable, which allows you to change its value as many times as needed.

Additionally, **const** is used for variables declared with **val** that have values known at compile-time.

Both **val** and **var** keywords are used to declare variables.

When declaring a variable, you need to specify its name after one of these keywords. It's important to note that variable names cannot start with a digit and usually start with a letter. Choose meaningful and readable names for variables to enhance code understanding.

To assign a value to a variable, use the assignment operator **=**.

Let's declare an immutable variable named **language** and initialize it with the string "Kotlin":

```kotlin
val language = "Kotlin"
```
Now, we can access the string value stored in the **language** variable. Let's print it:

```kotlin
println(language) // prints "Kotlin" (without quotes)
```
Once initialized, an immutable variable like **language** cannot be modified.

Variable names are case-sensitive, so **language** is not the same as **Language**.

Now, let's declare a mutable variable named **dayOfWeek** and print its value before and after changing it:

```kotlin
var dayOfWeek = "Monday"
println(dayOfWeek) // prints "Monday"

dayOfWeek = "Tuesday"
println(dayOfWeek) // prints "Tuesday"
```
In the example above, we declare a variable named **dayOfWeek** and initialize it with the value "Monday". We then access the value stored in the variable and print it. Later, we change the value of the variable to "Tuesday" and print the updated value.

To change the value of a variable, you don't need to declare it again. Simply assign a new value using the **=** operator.

It's also possible to declare and initialize a variable with the value of another variable:

```kotlin
val cost = 3
val costOfCoffee = cost
println(costOfCoffee) // prints 3
```
Storing Different Types of Values

Variables in Kotlin can store different types of values, including strings, numbers, characters, and other data types that we will encounter later. Let's declare three immutable variables to store a number, a string, and a character, and then print their values:

```kotlin
val ten = 10
val greeting = "Hello"
val firstLetter = 'A'

println(ten) // prints 10
println(greeting) // prints "Hello" (without quotes)
println(firstLetter) // prints 'A'
```
There is one restriction for mutable variables (declared with **var**). When reassigning their values, you can only use new values of the same type as the initial value. Assigning a value of a different type will result in an error. For example:

```kotlin
var number = 10
number = 11 // okay
number = "twelve" // error: type mismatch
```
Please remember this restriction when working with mutable variables.

## Conclusion
Now you understand that Kotlin provides two keywords for variable declaration: **val** for immutable variables and **var** for mutable variables. It is generally recommended to use immutable variables (**val**) whenever possible, as they promote code readability. If you find that a variable needs to be changed, then use **var**. Remember that the more mutable variables you have, the harder it becomes to read and understand your code. So, prioritize using **val** for improved code clarity.