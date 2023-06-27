# Lesson 3: Collections
When programming in Kotlin, it's often necessary to group data into structures for efficient processing. Kotlin provides several collection types for this purpose: Lists, Sets, and Maps.

## Lists
Lists are ordered collections of items. They can be either read-only or mutable. To create a read-only list, use the **listOf()** function. For a mutable list, use **mutableListOf()**. Kotlin can infer the type of items stored in the list, but you can also explicitly declare the type.

```kotlin
// Read-only list
val readOnlyShapes = listOf("triangle", "square", "circle")

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
```
You can access items in a list using the indexed access operator **[]**. Lists provide useful functions such as **first()**, **last()**, and **count()** for retrieving elements and determining the size of the list. You can also check if an item is in a list using the **in** operator.

To add or remove items from a mutable list, you can use the **add()** and **remove()** functions, respectively.

## Sets
Sets are unique unordered collections of items. They can also be either read-only or mutable. To create a read-only set, use the **setOf()** function, and for a mutable set, use **mutableSetOf()**. Kotlin can infer the item types, but explicit type declaration is also possible.

```kotlin
// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry")

// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
```
Since sets only contain unique elements, duplicate items are automatically dropped. You can check the presence of an item in a set using the **in** operator. Adding or removing items from a mutable set can be done using the **add()** and **remove()** functions.

## Maps
Maps are sets of key-value pairs, where keys are unique and map to only one value. Similar to lists and sets, maps can be read-only or mutable. To create a read-only map, use the mapOf() function, and for a mutable map, use mutableMapOf(). You can explicitly declare the types of keys and values.

```kotlin
// Read-only map
val readOnlyAccountBalances = mapOf(1 to 100, 2 to 100, 3 to 100)

// Mutable map with explicit type declaration
val accountBalances: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
```
Accessing values in a map is done using the indexed access operator **[]** with the corresponding key. Maps provide functions such as **count()**, **put()**, **remove()**, and **containsKey()** for counting items, adding or removing key-value pairs, and checking the presence of a key. The **keys** and **values** properties allow you to obtain collections of keys and values, respectively.

## Conclusion
In this lesson, you learned about collections in Kotlin, including Lists, Sets, and Maps. You explored how to create and manipulate these collection types, access their elements, and perform common operations. Collections are powerful tools for managing and processing data in your Kotlin programs.