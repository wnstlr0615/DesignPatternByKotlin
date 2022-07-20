package part04.bridge

open class Display(
    private val impl: DisplayImpl
) {
    fun open() = impl.rawOpen()
    fun print() = impl.rawPrint()
    fun close() = impl.rawClose()
    fun display() {
        open()
        print()
        close()
    }
}
