package algorithm.queue

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ArrayQueueTest {

    @Test
    fun test(){
        val queue = ArrayQueue<Int>(2)
        assertTrue(queue.size == 0)
        queue.enqueue(1)
        queue.enqueue(2)
        assertEquals(queue.peek(), 1)
        assertEquals(queue.dequeue(), 1)
        assertEquals(queue.peek(), 2)
        assertEquals(queue.dequeue(), 2)
        assertEquals(queue.peek(), null)
        assertEquals(queue.dequeue(), null)
        assertTrue(queue.size == 0)
        queue.enqueue(1)
        queue.enqueue(2)
        assertEquals(queue.size, 2)
        assertEquals(queue.dequeue(), 1)
        queue.enqueue(3)
        queue.enqueue(4)
        assertEquals(queue.size, 3)
        queue.dequeue()
        queue.dequeue()
        queue.dequeue()
        assertEquals(queue.size, 0)
    }
}