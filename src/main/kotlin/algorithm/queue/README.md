## 队列
先进先出

和栈的区别时 栈是先入后出 队列是先入先出

> 队列跟栈一样，也是一种操作受限的线性表数据结构。队列只允许在一端插入数据，在另一端删除数据。队列的这种操作受限的特性，使得队列可以用来做一些“先进先出”的操作，比如排队等。
> </br> 跟栈一样，队列可以用数组来实现，也可以用链表来实现。用数组实现的栈叫作顺序栈，用链表实现的栈叫作链式栈。同样，用数组实现的队列叫作顺序队列，用链表实现的队列叫作链式队列。

队尾插入，队头删除

1. LinkedList 使用链表实现的队列 无限容量
2. ArrayQueue 使用数组实现的队列 支持动态扩容
3. ArrayRingQueue 使用数组实现的循环队列 有限容量



