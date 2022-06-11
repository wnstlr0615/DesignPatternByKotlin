package chapter01.iterator.array

import chapter01.iterator.Iterator

class BookShelfArrayIterator(
    private var bookShelfArray: BookShelfArray,
    private var index: Int = 0
) : Iterator {
    override fun hasNext(): Boolean = index < bookShelfArray.getLength()

    override fun next() = bookShelfArray.getBookAt(index++)

}
