package part04.composite

abstract class Entry {
    abstract fun getName(): String
    abstract fun getSize(): Int
    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }
    fun printList() = printList(" ")

    abstract fun printList(preFix: String)
    override fun toString() = "${getName()} (${getSize()})"
}
