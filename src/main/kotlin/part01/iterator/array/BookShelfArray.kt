package part01.iterator.array

import part01.iterator.Aggregate
import part01.iterator.Book
import part01.iterator.Iterator

class BookShelfArray (
    private var books: Array<Book?>,
    private var last: Int = 0
) : Aggregate {
    constructor(maxSize: Int) : this(arrayOfNulls<Book>(maxSize)) {
    }
    override fun iterator(): Iterator {
        return BookShelfArrayIterator(this)
    }
    fun appendBook(book: Book) {books[last++] = book}

    fun getBookAt(index: Int) = books[index]
    fun getLength() = last
}