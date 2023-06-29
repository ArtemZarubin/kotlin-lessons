# Naming variables
Why naming is important

As you know, every variable should have a unique name that identifies it. Naming variables can seem easy. However, that is not true. Experienced programmers are very cautious with choosing names for variables, so their code is easy to follow. It is very important, as programmers spend a lot of time reading code written by others. Trust us — your code will become unreadable if variables have bad names.

How can we avoid this? Always give descriptive and concise names to all variables. That way, your colleagues will enjoy reading your code. There are two sets of rules that restrict possible names for variables.

## Naming rules
Kotlin has several rules:

- Names are case-sensitive (number is not the same as Number);
- Each name can include only letters, digits, and underscores;
- A name cannot start with a digit;
- A name cannot be a keyword (for example, **val**, **var**, **fun** are illegal).
So, no whitespaces are allowed in a variable's name. You can use spaces only with backticks:

```kotlin
val `good name` = 5
val bad name = 2 // will not work
```
If you break these rules, your program will not work.

Take a look at valid variable names:

```kotlin
score, level, fruitType, i, j, abc, _cost, number1, `name with space`
```
Below are the incorrect ones:

```typescript
@pple, $dollar, 1number, !ab, val, var, _, name with space
```
## Conventions for naming variables
Kotlin also provides the following conventions:

- If a variable name is a single word, put it in lowercase (for example — **number**, **value**);
- If a variable name includes multiple words, put them in lowerCamelCase, so that the first word is lowercase, while other words start with a capital letter (for example — **numberOfCoins**);
- Do not start variables with an underscore _. Technically, you can do it, though;
- Choose meaningful names for your variables, for example, **score** makes more sense than **s**, although they are both valid.
## Magic numbers
Now, let's discuss the naming of constant numbers and their usage. Sometimes, you need to use a constant in your code: for example, when you want to print the number of weekdays, which is always equal to 7. However, the following code won't be very informative for others (or even for yourself in a while):

```kotlin
println(7)
```
What is 7? Why is it being printed? No clue. Such values in code are called magic numbers. Magic numbers are not necessarily numbers — it's not about the data type but rather about the "magical" essence of such variables: no one knows where they came from, what they are for, and what they mean. So, avoid them.

What should we do with such values then?

First, such values must be stored in immutable variables, namely constants. Here we are not talking about just any values declared as **val**. By constants, we mean values which we denote as **const val** outside of the **main()** function or any other function. These are completely immutable constants (this is not an exhaustive explanation; we will discuss the topic in detail later). Here's an example:

```kotlin
const val DAYS_OF_THE_WEEK = 7

fun main() {
// ...
println(DAYS_OF_THE_WEEK) // 7
// ...
}
```
Second, the name of a constant should be meaningful, and when naming constants, we use the SCREAMING_SNAKE_CASE style.

Here is a bad example of a constant name:

```kotlin
const val s = 4
```
This will compile, but the code is not self-explanatory. And here's a good example:

```kotlin
const val SEASONS = 4
```
Create a constant, give it a meaningful name, and replace the number with it.

## Conclusion
Naming variables is a serious business indeed, but the conventions above are optional. We recommend that you follow them. As we have mentioned before, they improve the readability of your code and can make things easy for your colleagues.