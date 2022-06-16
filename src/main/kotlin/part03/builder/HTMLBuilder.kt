package part03.builder

import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder(
    private var filename: String?,
    private var writer: PrintWriter?
) : Builder{
    constructor() : this(null, null)

    override fun makeTitle(title: String) {
        filename = "$title.html"
        try {
            writer = PrintWriter(FileWriter(filename!!))
        }catch (e: IOException){
            e.printStackTrace()
        }
        writer?.println("<html><head><title>$title</title></head><body>")
        writer?.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer?.println("<p>$str</p>")
    }

    override fun makeItems(items: Array<String>) {
        writer?.println("<ul>")
        for (item in items) {
            writer?.println("<li>$item</li>")
        }
        writer?.println("</ul>")
    }

    override fun close() {
        writer?.println("</body></html>")
        writer?.close()
    }

    fun getResult() = filename
}