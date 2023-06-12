package algorithm.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class LinkedStackTest {

    @Test
    fun test(){
        val stack = LinkedStack()
        assertNull(stack.peek())
        assertNull(stack.pop())
        stack.push(1)
        assertEquals(stack.peek(), 1)
        stack.push(2)
        assertEquals(stack.peek(), 2)
        assertEquals(stack.pop(), 2)
        assertEquals(stack.peek(), 1)
        assertEquals(stack.pop(), 1)
        assertNull(stack.peek())
        assertNull(stack.pop())

    }
}