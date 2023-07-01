import java.util.Scanner

const val LEADING_ZERO_THRESHOLD = 9

fun formatData(month: String, day: String, year: String, hours: String, minutes: String): String {
    val formattedMonth = if (month.toInt() <= LEADING_ZERO_THRESHOLD) "0$month" else month
    val formattedDay = if (day.toInt() <= LEADING_ZERO_THRESHOLD) "0$day" else day
    val formattedHours = if (hours.toInt() <= LEADING_ZERO_THRESHOLD) "0$hours" else hours
    val formattedMinutes = if (minutes.toInt() <= LEADING_ZERO_THRESHOLD) "0$minutes" else minutes

    return "$formattedMonth/$formattedDay/$year $formattedHours:$formattedMinutes"
}

fun main() {
    println("Hello, Kotlin!\n") // Wassup bro

    val objectiveOfTheProject = """
        This repository serves as a dedicated space for documenting and sharing my
        journey of learning the Kotlin programming language. It aims to
        provide a comprehensive collection of resources, examples, and projects to
        support my learning process and showcase my progress.
    """.trimIndent()
    println("$objectiveOfTheProject\n")
    // This code initializes and prints a variable 'objectiveOfTheProject' with the project objective

    val scanData = Scanner(System.`in`)
    print("Enter full name: ")
    val fullUsersName = scanData.nextLine()
    print("Enter username: ")
    val username = scanData.nextLine()

    print("Welcome back, $username. $fullUsersName, how are you: ")

    when (scanData.nextLine()) {
        null -> println("Is everything alright?")
        "Fine" -> println("That's great!")
        "Good" -> println("Glad to hear it!")
        "Not bad" -> println("That's good to know.")
        "Okay" -> println("Alright then.")
        "Great" -> println("Awesome!")
        "So-so" -> println("Oh, I see.")
        "Could be better" -> println("I hope things improve for you.")
        "I'm tired" -> println("Take some rest and recharge.")
        "I'm happy" -> println("That's wonderful!")
        "I'm sad" -> println("I'm here for you if you want to talk.")
        "I'm excited" -> println("That's fantastic!")
        "I'm stressed" -> println("Try to take some time for yourself to relax.")
        else -> println("I appreciate your honesty.")
    }
    println()
    // This code prompts the user to enter their full name and username using a Scanner,
    // and then asks about their mood. Based on the user's input, it prints a corresponding
    // message using a when statement.

    print("Enter hours and minutes(separated by spaces): ")
    val (hours, minutes) = readln().split(" ")
    print("Enter month, day and year(separated by spaces): ")
    val (month, day, year) = readln().split(" ")
    println("Entered data: ${formatData(month, day, year, hours, minutes)}")
    println()
    // This code prompts the user to input time and date and then formats them for output in the desired format.
    // It also takes into account adding leading zeros to single-digit months and days for consistency.
    // As a result, the user receives the entered data in the form of a formatted date and time according
    // to the specified pattern.

    print("Will you rate my repository? Your answer(true for yes, false for now, silence for *secret*): ")
    when (readln().toBooleanStrictOrNull()) {
        null -> println(
            "Secret #1. Great, you found the first secret, or hint. " +
                    "My full application will be associated with some kind of success. " +
                    "Stay tuned for more updates!"
        )

        true -> println("Thanks friend, I appreciate you!")
        false -> println("I'm sorry you didn't like my repository, I'll work on improving it")
    }
    println()
    // This code prompts the user to rate the repository and provides different responses based on their input.
    // It includes a secret message that is revealed when the input is left blank.
    // The code demonstrates how to handle different scenarios based on the user's feedback.

    print("Enter a number to perform a series of actions on it: ")
    var interestingNumber = readln().toInt()

    // Printing initial information
    print("You are given the number $interestingNumber, " +
            "after this operation: (interestingNumber++ + ++interestingNumber), " +
            "which will be equal to the variable (interestingNumber is given number): ")

    // Performing the operation
    val resultOfPerform = interestingNumber++ + ++interestingNumber

    // Getting user input for comparison
    val compareWithResult = readln().toInt()

    // Checking the user's answer
    if (resultOfPerform == compareWithResult) {
        println("Great answer, it's correct!")
    } else if ((resultOfPerform - compareWithResult == 1) || (compareWithResult - resultOfPerform == 1)) {
        println("Your answer was very close, think again!")
    } else {
        println("Your answer is wrong. You should think again!")
    }
}