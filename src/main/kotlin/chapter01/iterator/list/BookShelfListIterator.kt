package chapter01.iterator.list
import chapter01.iterator.Book
import chapter01.iterator.Iterator

class BookShelfListIterator(
    private val bookShelfList: BookShelfList,
    private var index: Int = 0
) : Iterator {
    override fun hasNext() =  index < bookShelfList.getLength()
    override fun next(): Book = bookShelfList.getBookAt(index++)

}
