import com.location.java.algorithm.linkedlist.Node
import com.location.java.algorithm.linkedlist.NodeList
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LinkedTest {


    @Test
    fun testSingleNode(){
        val nodeList = NodeList()
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)
        nodeList.deleteLast()
        nodeList.delete(node1)
        assert(nodeList.tail == null && nodeList.head == null)
        nodeList.append(node1)
        nodeList.append(node2)
        nodeList.append(node3)
        assert(nodeList.head == node1 && nodeList.tail == node3)
        nodeList.reverse()
        assertEquals(nodeList.head, node3)
        assertEquals(nodeList.tail, node1)
        nodeList.deleteLast()
        assertEquals(nodeList.tail, node2)
        nodeList.print()
        nodeList.delete(node3)
        assertEquals(nodeList.head, node2)
        assertEquals(nodeList.tail, node2)
    }


    @Test
    fun testRingLinked(){
        val nodeList = com.location.java.algorithm.linkedlist.ring.NodeList()
        val node1 = com.location.java.algorithm.linkedlist.ring.Node(1)
        val node2 = com.location.java.algorithm.linkedlist.ring.Node(1)
        val node3 = com.location.java.algorithm.linkedlist.ring.Node(1)
        nodeList.delete(node1)
        assertEquals(nodeList.head, null)
        assertEquals(nodeList.tail, null)
        nodeList.append(node1)
        assertEquals(nodeList.head, node1)
        assertEquals(nodeList.tail, node1)
        assertEquals(nodeList.head?.next, nodeList.tail)
        assertEquals(nodeList.tail?.next, nodeList.head)
        nodeList.append(node2)
        nodeList.append(node3)
        assertEquals(nodeList.head, node1)
        assertEquals(nodeList.tail, node3)
        assertEquals(nodeList.tail?.next, nodeList.head)
        assertEquals(nodeList.head?.next, node2)
        assertEquals(nodeList.head?.next?.next, node3)
        nodeList.reverse()
        assertEquals(nodeList.head, node3)
        assertEquals(nodeList.tail, node1)
        assertEquals(nodeList.tail?.next, nodeList.head)
        assertEquals(nodeList.head?.next, node2)
        assertEquals(nodeList.head?.next?.next, node1)
        nodeList.print()
        nodeList.deleteLast()
        assertEquals(nodeList.tail, node2)
        assertEquals(nodeList.tail?.next, nodeList.head)
        nodeList.delete(node3)
        assertEquals(nodeList.head, node2)
        assertEquals(nodeList.tail, node2)
        assertEquals(nodeList.tail?.next, nodeList.head)
        nodeList.delete(node2)
        assertEquals(nodeList.head, null)
        assertEquals(nodeList.tail, null)
    }

    @Test
    fun testTwoWayLinked(){
       val nodeList =  com.location.java.algorithm.linkedlist.twoway.NodeList()
        val node1 = com.location.java.algorithm.linkedlist.twoway.Node(1)
        val node2 = com.location.java.algorithm.linkedlist.twoway.Node(2)
        val node3 = com.location.java.algorithm.linkedlist.twoway.Node(3)
        nodeList.delete(node1)
        assertEquals(nodeList.head, null)
        assertEquals(nodeList.tail, null)
        nodeList.append(node1)
        assertEquals(nodeList.head, node1)
        assertEquals(nodeList.tail, node1)
        nodeList.append(node2)
        nodeList.append(node3)
        assertEquals(nodeList.head, node1)
        assertEquals(nodeList.tail, node3)
        assertEquals(nodeList.head?.next, node2)
        assertEquals(nodeList.tail?.prev, node2)
        assertEquals(nodeList.head?.next?.next, node3)
        assertEquals(nodeList.tail?.prev?.prev, node1)
        nodeList.reverse()
        assertEquals(nodeList.head, node3)
        assertEquals(nodeList.tail, node1)
        assertEquals(nodeList.head?.prev, null)
        assertEquals(nodeList.head?.next, node2)
        assertEquals(nodeList.tail?.prev, node2)
        assertEquals(nodeList.head?.next?.next, node1)
        assertEquals(nodeList.tail?.prev?.prev, node3)
        nodeList.print()
        nodeList.deleteLast()
        assertEquals(nodeList.tail, node2)
        assertEquals(nodeList.tail?.prev, node3)
        nodeList.delete(node3)
        assertEquals(nodeList.head, node2)
        assertEquals(nodeList.tail, node2)
        assertEquals(nodeList.tail?.prev, null)
        nodeList.delete(node2)
        assertEquals(nodeList.head, null)
        assertEquals(nodeList.tail, null)
    }

    @Test
    fun isSingleLinkPalindrome(){
        val list = NodeList().apply {
            append(Node(1))
            append(Node(2))
            append(Node(3))
            append(Node(2))
            append(Node(1))
        }
        assertTrue(list.isPalindrome())

        val list2 = NodeList().apply {
            append(Node(1))
            append(Node(2))
            append(Node(2))
            append(Node(1))
        }
        assertTrue(list2.isPalindrome())

        val list3 = NodeList()
        assertTrue(list3.isPalindrome())
        list3.append(Node(1))
        assertTrue(list3.isPalindrome())
        list3.append(Node(1))
        assertTrue(list3.isPalindrome())
        list3.append(Node(3))
        assertFalse(list3.isPalindrome())
        list3.append(Node(1))
        list3.append(Node(1))
        assertTrue(list3.isPalindrome())
    }


    @Test
    fun ringLinkNodeCopyTest(){
        val node1 = com.location.java.algorithm.linkedlist.ring.Node(1)
        val node2 = com.location.java.algorithm.linkedlist.ring.Node(1)
        val node3 = com.location.java.algorithm.linkedlist.ring.Node(1)
        node1.next = node2
        node2.next = node3
        node3.next = node1
        val newNode = node1.copy()
        assertFalse(newNode == node1)
        assertFalse(newNode.next == node2)
        assertFalse(newNode.next?.next == node3)
        assertTrue(newNode.next?.next?.next == newNode)
    }


}