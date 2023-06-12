package algorithm.queue

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LinkedQueueTest {
    @Test
    fun test(){
        val queue = LinkedQueue<Int>()
        assertTrue(queue.size == 0)
        assertEquals(queue.peek(), null)
        assertEquals(queue.dequeue(), null)
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        assertTrue(queue.size == 3)
        assertEquals(queue.peek(), 1)
        assertEquals(queue.dequeue(), 1)
        assertTrue(queue.size == 2)
        assertEquals(queue.peek(), 2)
        assertEquals(queue.dequeue(), 2)
        assertEquals(queue.peek(), 3)
        assertEquals(queue.dequeue(), 3)
        assertTrue(queue.size == 0)
        assertEquals(queue.peek(), null)
        assertEquals(queue.dequeue(), null)
    }
}