package part01.iterator.list

import part01.iterator.Aggregate
import part01.iterator.Book
import part01.iterator.Iterator

class BookShelfList(
    private val books: MutableList<Book> = mutableListOf()
) : Aggregate {
    override fun iterator(): Iterator = BookShelfListIterator(this)
    fun getLength() = books.size
    fun getBookAt(index: Int) = books[index]
    fun appendBook(book: Book) = books.add(book)

}