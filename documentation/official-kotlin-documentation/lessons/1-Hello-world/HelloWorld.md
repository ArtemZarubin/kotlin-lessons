# Lesson 1: Hello, World!

Welcome to the Kotlin course! In this lesson, we will get familiar with the basics of the language and write a simple "Hello, World!" program.

## Program Code

```kotlin
fun HelloWorld() {
    // Lesson #1. Hello World
    println("Hello, World!")  // Simple example of a "Hello, World!" program

    /* Recommended to declare all variables as read-only (val) by default.
    Declare mutable variables (var) only if necessary.*/

    val numberOfArms: Int = 2   // I have 2 arms
    val numberOfLegs: Int = 2   // And also 2 legs
    var myAge: Int = 16 // Surprise! I'm 16 y.o. (Maybe)
    myAge = 19  // I'm getting older =( P.S. This is my real age

    val friends: Int = 3
    println("I have $friends real friends!")
    // There are my real friends
    println("But I also have ${friends + 3} good friends.")
    // There are my usual friends
}
```
## Code Explanation
At the beginning of the program, we print the message "Hello, World!" using the **println()** function.

Next, we declare several variables:

- **numberOfArms** and **numberOfLegs** are of type **Int** and store the number of arms and legs respectively.
- **myAge** is a mutable variable (**var**), and we assign it the value 16, and then update it to 19.
- **friends** is a value that describes the number of real friends.
We print messages to the console using string interpolation. We use the friends variable and perform the calculation friends + 3 to get the total number of friends.

## Output
In this lesson, we learned the basics of the Kotlin language and wrote a simple "Hello, World!" program. We learned about the recommendations for declaring variables and used string interpolation to display messages on the console.

Congratulations on successfully running your first Kotlin program!