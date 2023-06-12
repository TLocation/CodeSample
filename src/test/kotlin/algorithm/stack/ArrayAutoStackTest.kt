package algorithm.stack

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ArrayAutoStackTest {
    @Test
    fun test(){
        val stack = ArrayAutoStack<Int>(3)
        assertTrue(stack.push(1))
        assertTrue(stack.push(2))
        assertTrue(stack.push(3))
        assertTrue(stack.push(4))
        assertEquals(stack.peek(),4)
        assertEquals(stack.pop(),4)
        assertEquals(stack.peek(),3)
        assertEquals(stack.pop(),3)
        assertEquals(stack.pop(),2)
        assertEquals(stack.pop(),1)
        assertEquals(stack.peek(),null)
        assertEquals(stack.pop(),null)

    }

}