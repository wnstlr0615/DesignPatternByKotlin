package part03.abstract_factory

abstract class Item(
    open val caption: String,
) {
    abstract fun makeHTML(): String
}
