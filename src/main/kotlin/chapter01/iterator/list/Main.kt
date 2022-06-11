package chapter01.iterator.list

import chapter01.iterator.Book

fun main() {
    val bookShelfList = BookShelfList()
    bookShelfList.appendBook(Book("joon1"))
    bookShelfList.appendBook(Book("joon2"))
    bookShelfList.appendBook(Book("joon3"))
    bookShelfList.appendBook(Book("joon4"))
    val iterator = bookShelfList.iterator()

    while(iterator.hasNext()){
        println(iterator.next()?.name)
    }
}