package com.location.java.design.iterator

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.count
    }

    override fun next(): Book {
        return bookShelf.getBookAt(index++)
    }
}