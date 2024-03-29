package part03.abstract_factory.listfactory

import part03.abstract_factory.Link

class ListLink(
    caption: String,
    url: String
) : Link(caption, url) {
    override fun makeHTML(): String {
        return "<li><a href=\"${url}\"> $caption</a></li>\n"
    }
}
