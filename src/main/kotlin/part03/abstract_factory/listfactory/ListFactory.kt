package part03.abstract_factory.listfactory

import part03.abstract_factory.Factory
import part03.abstract_factory.Link
import part03.abstract_factory.Page
import part03.abstract_factory.Tray

class ListFactory : Factory() {
    override fun createLink(caption: String, url: String): Link {
        return ListLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return ListTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return ListPage(title, author)
    }
}
