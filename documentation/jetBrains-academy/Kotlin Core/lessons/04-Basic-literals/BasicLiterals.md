# Basic Literals in Kotlin
Regardless of their complexity, all programs essentially perform operations on numbers, strings, and other values. These values are called literals, representing the most basic sense or meaning of the symbol. Before we start writing our first programs, let's learn the basic literals in Kotlin: integer numbers, characters, and strings. These literals are encountered everywhere in everyday life.

## Integer Numbers
We use integer numbers to count things in the real world, and they are frequently used in Kotlin.

Here are several examples of valid integer number literals, separated by commas: 0, 1, 2, 10, 11, 100.

If an integer value contains a large number of digits, we can add underscores to divide the digits into blocks, making the number more readable. For example, 1_000_000 is much easier to read than 1000000.

You can add as many underscores as you'd like: 1__000_000, 1_2_3. However, remember that underscores cannot appear at the start or end of the number. Writing 10 or 100 will result in an error.

## Characters
A single character can represent a digit, a letter, or another symbol. To denote a single character, we enclose the symbol in single quotes. Here are some examples: 'A', 'B', 'C', 'x', 'y', 'z', '0', '1', '2', '9'. Character literals can represent alphabet letters, digits from '0' to '9', whitespaces (' '), or other symbols (e.g., '$').

It's important not to confuse characters representing numbers (e.g., '9') and numbers themselves (e.g., 9).

A character can only include a single symbol and cannot contain multiple digits or letters. The following examples are incorrect: 'abc', '543', as these literals have too many characters.

## Strings
Strings represent textual information, such as the text of an advertisement, the address of a web page, or a website's login. A string is a sequence of individual characters.

To define strings, we enclose characters in double quotes. Here are some valid examples: "text", "I want to learn Kotlin", "123456", "**e-mail@gmail.com**". Strings can contain letters, digits, whitespaces, and other characters.

A string can also consist of a single character, like "A". However, it should not be confused with the character 'A', which is not a string.

## Conclusion
It is crucial to differentiate between these literals:

- 123 is an integer number, and "123" is a string.
- 'A' is a character, and "A" is a string.
- '1' is a character, and 1 is an integer number.

Kotlin offers many other types of literals, which we will explore in our journey.