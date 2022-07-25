package part04.composite

class File(
    private val name: String,
    private val size: Int
) : Entry() {
    override fun getName() = name
    override fun getSize() = size
    override fun printList(preFix: String) {
        println("$preFix / $this")
    }
}
