package part03.abstract_factory

abstract class Link(
    protected val url: String,
    caption: String
) : Item(caption)
