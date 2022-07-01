package part03.abstract_factory.listfactory

import part03.abstract_factory.Page

class ListPage(
    title: String,
    author: String
) : Page(title, author) {
    override fun makeHTML(): String {
        val buffer = StringBuffer()
        buffer.append("<html lang = \"kr\">\n<head><title>$title</title>\n<meta charset=\"utf-8\" />\n</head>\n")
        buffer.append("<body>")
        buffer.append("<h1>$title</h1>\n")
        buffer.append("<ul>\n")
        val it = content.iterator()
        while (it.hasNext()) {
            val item = it.next()
            buffer.append(item.makeHTML())
        }
        buffer.append("</ul>\n")
        buffer.append("<hr><address>$author</address>")
        buffer.append("</body></html>\n")
        return buffer.toString()
    }
}
