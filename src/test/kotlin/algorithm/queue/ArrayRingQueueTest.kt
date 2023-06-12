package algorithm.queue

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ArrayRingQueueTest {
    @Test
    fun test(){
        val queue = ArrayRingQueue<Int>(5)
        assertTrue(queue.size == 0)
        assertTrue(queue.peek() == null)
        assertTrue(queue.dequeue() == null)
        repeat(5){
            assertTrue(queue.enqueue(it))
        }

        assertFalse(queue.enqueue(6))
        assertTrue(queue.peek() == 0)
        assertTrue(queue.dequeue() == 0)
        assertTrue(queue.enqueue(6))
        assertTrue(queue.size == 5)
    }
}