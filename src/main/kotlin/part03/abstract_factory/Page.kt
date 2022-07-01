package part03.abstract_factory

import java.io.FileWriter

abstract class Page(
    protected val title: String,
    protected val author: String,
) {
    protected val content: MutableList<Item> = mutableListOf()

    fun add(item: Item) {
        content.add(item)
    }
    fun output() {
        val filename = "$title.html"
        FileWriter(filename).use {
            it.write(this.makeHTML())
            println("${filename}을 작성 하였습니다.")
        }
    }
    abstract fun makeHTML(): String
}
