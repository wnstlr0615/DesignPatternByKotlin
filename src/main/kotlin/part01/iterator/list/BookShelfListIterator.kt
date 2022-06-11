package part01.iterator.list
import part01.iterator.Book
import part01.iterator.Iterator

class BookShelfListIterator(
    private val bookShelfList: BookShelfList,
    private var index: Int = 0
) : Iterator {
    override fun hasNext() =  index < bookShelfList.getLength()
    override fun next(): Book = bookShelfList.getBookAt(index++)

}
