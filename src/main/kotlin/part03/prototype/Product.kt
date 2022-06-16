package part03.prototype

interface Product : Cloneable {
    fun use(s: String)
    fun createClone(): Product?
}