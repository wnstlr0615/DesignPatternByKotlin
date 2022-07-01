package part03.abstract_factory

abstract class Factory {
    companion object {
        fun getFactory(className: String): Factory {
            var factory: Factory? = null
            try {
                factory = Class.forName(className).newInstance() as Factory
            } catch (e: ClassNotFoundException) {
                error("클래스 $e 이 발견 되지 않았습니다.")
            } catch (e: Exception) {
                e.printStackTrace()
            }
            return factory!!
        }
    }
    abstract fun createLink(caption: String, url: String): Link
    abstract fun createTray(caption: String): Tray
    abstract fun createPage(title: String, author: String): Page
}
