package chapter01.iterator.array

import chapter01.iterator.Book

fun main() {
    val bookShelfArray = BookShelfArray(4)
    bookShelfArray.appendBook(Book("joon1"))
    bookShelfArray.appendBook(Book("joon2"))
    bookShelfArray.appendBook(Book("joon3"))
    bookShelfArray.appendBook(Book("joon4"))
    val iterator = bookShelfArray.iterator()

    while(iterator.hasNext()){
        println(iterator.next()?.name)
    }
}