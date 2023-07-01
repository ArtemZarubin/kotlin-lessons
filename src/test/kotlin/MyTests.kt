import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

// Class containing tests
class MyTests {

    // Test case 1
    @Test
    fun test1() {
        assertEquals(2, 1 + 1) // Check if the sum of 1 and 1 is equal to 2
    }

    // Test case 2
    @Test
    fun test2() {
        assertEquals(4, 2 * 2) /* Check if the product of 2 and 2 is equal to 4 */
    }
}