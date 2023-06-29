import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello, Kotlin!") // Wassup bro

    val scanData = Scanner(System.`in`)
    print("Enter full name: ")
    val fullUsersName = scanData.nextLine()
    print("Enter username: ")
    val username = scanData.nextLine()

    print("Welcome back, $username. $fullUsersName, how are you: ")
    val usersMood = scanData.nextLine()

    when (usersMood) {
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
}