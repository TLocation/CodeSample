package com.location.java.algorithm.linkedlist

/**
 * 单向链表
 */
private class Node(var data: Int) {
    companion object{
        private var sId = 0
    }
    var next: Node? = null
    val id = sId++

    override fun toString(): String {
        return "Node(id=$id, data=$data)"
    }
}


private class NoteList(){
    private var head: Node? = null
    private var tail: Node? = null

    fun append(node: Node){
        if(head == null){
            head = node
            tail = head
        }else{
            tail?.next = node
            tail = node
        }
    }

    fun deleteLast(){
        tail?.let {
            delete(it)
        }
    }

    fun delete(delete: Node):Boolean{
        if(head == null){
            return false
        }
        if(head == delete){
            tail = if(tail == head){
                delete.next
            }else{
                tail
            }
            head = delete.next
            return true
        }
        var current = head
        //遇到下一个是要删除的节点 停止循环
        while (current?.next != delete){
            current = current?.next
        }
        current.next = delete.next
        if(delete.next == null){
            tail = current
        }
        return true
    }

    fun reverse(){
        var prev: Node? = null
        var node = head
        head = tail
        tail = node
        while (node != null){
            val next = node.next
            //反转是下一个节点是上一个节点 一步步完成反转
            node.next = prev
            prev = node
            node = next
        }
    }

    fun print(){
        var node = head
        println("head:$head")
        println("tail:$tail")
        while (node != null){
            println("${node}-->${node.next}")
            node = node.next
        }
    }
}

private fun main() {
    val nodeList = NoteList()
    val node3 = Node(3)
    with(nodeList){
        append(Node(1))
        append(Node(2))
        append(node3)
        append(Node(4))
        append(Node(5))
    }

    nodeList.print()
//    nodeList.reverse()
//    println("reverse")
//    nodeList.print()


    println("delete ")
    nodeList.delete(node3)
    nodeList.print()
}

