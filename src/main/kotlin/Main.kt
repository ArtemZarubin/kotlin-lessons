fun main(args: Array<String>) {
    // Lesson #2. Basic types
    var players = 5

    // Some players leave the game
    players = 3

    players = players + 1 // Example of addition: 4
    players += 5          // Example of addition: 9
    players -= 2          // Example of subtraction: 7
    players *= 3          // Example of multiplication: 21
    players /= 7          // Example of division: 3

    println("Number of players: $players") // Number of players: 3

    // Variable declared without initialization
    val woInit: Int
    // Variable initialized
    woInit = 7620   // My favorite number

    // Variable explicitly typed and initialized
    val myNameIs: String = "Artem Zarubin"

    // Variables can be read because they have been initialized
    println("Integer: $woInit") // Integer: 7620
    println("My name is $myNameIs") // My name is Artem Zarubin

    val aa: Int = 1000   // Exercise #2. Explicitly declare the correct type for each variable.
    val bb: String = "log message"
    val cc: Double = 3.14
    val dd: Long = 100_000_000_000_000
    val ee: Boolean = false
    val ff: Char = '\n'
    println()

    // Lesson #3. Collections
    // Read only list
    val readOnlyShapes = listOf("Circle", "Triangle", "Square")
    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("Square", "Triangle", "Circle")
    println("First item in shapes is ${shapes[0]}.")    // The first item in the list is: Square
    println("Getting last item from shapes by using function. Last item: ${shapes.last()}") // The last item in the list 'shapes' is: Circle
    println("There is ${shapes.count()} items in the list.") // This list has 3 items
    println("Is there 'Circle' in shapes: " + ("Circle" in shapes))

    // Add "polygon" to the list 'shapes'
    shapes.add("Polygon")
    println("Items in the list: $shapes")   // Showing full list

    // Removing "Triangle" from the list 'shapes'
    shapes.remove("Triangle")
    println("Items in the list now: $shapes")   // Showing full list now

    // Read only Set
    val readOnlyFruit = setOf("Apple", "Banana", "Coconut", "Cabbage", "Tomato", "Cucumber")
    // Mutable Set with explicit type declaration
    val fruitsSet: MutableSet<String> = mutableSetOf("Banana", "Mango", "Orange", "Strawberry", "Cherry", "Kiwi", "Kiwi")   // There is 7 items, but second "Kiwi" will be dropped
    println("Number of fruits: ${fruitsSet.count()}. Set of fruits: " + fruitsSet)  // This set has 6 items. Showing them
    println("Is there 'grape' in fruits: " + ("grape" in fruitsSet))    // Answer: false

    // Add "plum" to the set 'fruitsSet'
    fruitsSet.add("Plum")
    println("Items in the set: $fruitsSet")   // Showing full set of fruits

    // Removing "Cherry" from the set 'fruitsSet'
    shapes.remove("Cherry")
    println("Items in the set right now: $fruitsSet")   // Showing full list right now

    // Read-only map
    val readOnlyAccountBalances = mapOf(1 to 1337, 2 to 7620, 3 to 19, 4 to 56, 5 to 78)
    // Mutable map with explicit type declaration
    val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 19, 2 to 1337, 3 to 7620, 4 to 91)
    println("The first value in the map is: ${readOnlyAccountBalances[1]}") // The first value in the map is: 1337
    println("This map has ${readOnlyAccountBalances.count()} key-value pairs")  // This map has 5 key-value pairs

    // Add key 5 with value 867 to the list
    accountBalances.put(5, 867)
    println("Items in the map: $accountBalances")   // Items in the map: {1=19, 2=1337, 3=7620, 4=91, 5=867}

    // Remove the key 1 from the list
    accountBalances.remove(1)
    println("Items in the map now: $accountBalances")   // Items in the map now: {2=1337, 3=7620, 4=91, 5=867}
    println("Is there a key 4? Answer is " + readOnlyAccountBalances.containsKey(4))    // Is there a 4 key? Answer is true

    // Only keys and only values
    println("Only keys: ${readOnlyAccountBalances.keys}")   // Only keys: [1, 2, 3, 4, 5]
    println("Only values: ${readOnlyAccountBalances.values}")   // Only values: [1337, 7620, 19, 56, 78]

    // To check that a key or value is in a map, use the 'in' operator
    println("Key 4 in readOnlyAccountBalances: " + (4 in readOnlyAccountBalances.keys)) // True
    println("Value 999 in readOnlyAccountBalances: " + (999 in readOnlyAccountBalances.values)) // False

    /* Exercise #3.1. You have a list of “green” numbers and a list of “red” numbers.
    Complete the code to print how many numbers there are in total. */
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val resultOfCounting: Int = greenNumbers.count() + redNumbers.count()   // Adding the numbers from both lists to get the total
    println("There is $resultOfCounting numbers in total.")

    /* Exercise #3.2. You have a set of protocols supported by your server.
    A user requests to use a particular protocol. Complete the program to check whether
    the requested protocol is supported or not (isSupported must be a Boolean value). */
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested: String = "smtp"
    val isSupported: Boolean = requested.uppercase() in SUPPORTED   // Checking if this 'requested' is in the set 'SUPPORTED'
    println("Support for $requested: $isSupported") // Support for smtp: false

    /* Exercise #3.3. Define a map that relates integer numbers from 1 to 3
    to their corresponding spelling. Use this map to spell the given number. */
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}