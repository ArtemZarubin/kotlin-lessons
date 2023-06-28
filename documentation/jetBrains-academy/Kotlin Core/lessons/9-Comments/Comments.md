# Comments in Kotlin
Here comes a comet... Oh, sorry, a comment—brief but enlightening. So, what exactly are those comments and what do we need them for? Well, essentially, that's what we call a special text that will be ignored by the compiler. Comments allow you to clarify a piece of code or exclude it from the compilation process (that is, disable it). Throughout this course, we will use comments to explain how and why our code works.

There are three kinds of comments in Kotlin. Let's take a look at them.

## End-of-line comments
After **//**, the compiler ignores any remaining text on the line.

```kotlin
fun main() {
// The line below will be ignored
// println("Hello, World")

    // This prints the string "Hello, Kotlin"
    println("Hello, Kotlin")  // Here can be any comment
    /// Valid single-line comment
}
```
Did you know? In most code editors, a line can be commented by placing the caret on the line and pressing **Ctrl + /** or **cmd + /**.

## Multi-line comments
The compiler ignores any text between the **/*** and ***/** symbols. You can use them for writing both single-line and multiple-line comments:

```kotlin
fun main() {
/* This is a single-line comment */
/*  This is an example of
a multi-line comment */

    /*** Valid multiline comment
        println("Hello")
        println("World")
    **/
}
```
You can also put comments inside other comments. When writing nested multi-line comments, make sure the opening **/*** and the closing ***/** signs make pairs.

```kotlin
fun main() {
/*
System.out.println("Hello")  // print "Hello"
System.out.println("Kotlin") /* print "Kotlin" */
*/
}
```
## Documentation comments (doc comments)
The compiler ignores any text between the **/**** and ***/** signs just like it ignores all text in multi-line comments. These kinds of comments are called documentation comments (doc comments). Documentation is a text that helps others understand what your code does. You can use these kinds of comments to automatically generate documentation about your source code using a special tool.

Usually, these comments are placed above the declarations of respective program elements. Also, in this case, some special labels, such as **@param**, **@return**, and others are used for controlling the tool.

Let's take a look at the example below.

```kotlin
/**
* The `main` function accepts string arguments from outside.
*
* @param args arguments from the command line.
  */
  fun main(args: Array<String>) {
  // do something
  }
```
  Do not be afraid if you don’t completely understand documentation comments yet. Later, we will take a closer look at them.

## Conclusion
We've briefly discussed several kinds of comments you can insert in your code. Use them wisely and remember that numerous comments do not always make your program absolutely clear. The code may change, and the comments will become outdated. To reduce the number of comments, you should write self-documenting code, which might not be that simple for beginners. We will learn how to do it during the course.