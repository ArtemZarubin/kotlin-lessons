# Your First Kotlin Program: Hello, World!
In this lesson, you will write your first Kotlin program that prints "Hello, World!" This is the initial step that every beginner takes when learning a new programming language. Although the program itself is very simple, it is a fully functional program that demonstrates the basic syntax of the Kotlin programming language.

## Hello, World!
Here is the source code for the program:

```kotlin
fun main() {
println("Hello, World!")
}
```
If you have already set up a programming environment on your computer, you can run the program there. If not, don't worry, we'll cover that later.

## Basic Terminology
Now, let's familiarize ourselves with some basic terminology and then try to understand our program.

- **Program**: A program is a sequence of instructions, called statements, that are executed one after another in a predictable manner. The most common scenario is sequential flow, where statements are executed in the order they are written, from top to bottom.

- **Statement**: A statement, or programming statement, is a single command to be executed. In our case, it involves printing a text.

- **Expression**: An expression is a piece of code that produces a single value. For example, 2 * 2 is an expression that evaluates to 4.

- **Block**: A block is a group of zero or more statements enclosed in curly braces ({...}). In our program, we have a single block.

- **Keyword**: A keyword is a word that has a special meaning in the programming language. The names of keywords cannot be changed.

- **Identifier**: An identifier, or a name, is a word written by the programmer to identify something.

- **Comment**: A comment is a piece of text that is ignored when executing the program. It serves to explain parts of the code. In Kotlin, comments start with //.

- **Whitespace**: Whitespace refers to blank areas, tabs, or newlines used to separate words in the program and improve readability.

## The Hello World Program Under a Microscope
The Hello World program demonstrates the use of basic elements in any Kotlin program. We will focus on the most important aspects for now.

- **The Entry Point**: The keyword **fun** defines a function that contains a piece of code to execute. This function has a special name, **main**, which indicates the entry point of a Kotlin program. The function's body is enclosed in curly braces.

```kotlin
fun main() {
// ...
}
```
- **Printing "Hello, World!"**: The body of the **main** function consists of programming statements that define what the program should do. Our program prints the string "Hello, World!" using the following statement:

```kotlin
println("Hello, World!")
```
In this statement, we invoke the **println** function to display the string followed by a new line on the screen. We will often use this method to print output.

Note that **"Hello, World!"** is not a keyword or a name; it is a string literal to be printed on the screen.

## Programs with Multiple Statements
As a general rule, a program contains multiple statements. Each statement should be written on a new line. For example, the program below consists of two statements:

```kotlin
fun main() {
println("Hello")
println("World")
}
```
When you run this program, it will display the following output:

```kotlin
Hello
World
```

## Conclusion
Congratulations! You have written your first program that prints "Hello, World!" It contains a function named **main**, which serves as the entry point of the program. Don't worry too much about the terminology (syntax, statement, block) at this stage; we will explain them in more detail throughout this course. Remember to use this initial code as a template for your future programs.