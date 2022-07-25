package part04.composite

class Directory(
    private val name: String
) : Entry() {
    val directory = mutableListOf<Entry>()
    override fun getName() = name

    override fun getSize() = directory.stream().mapToInt { it.getSize() }.sum()
    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }
    override fun printList(preFix: String) {
        println("$preFix / $this")
        directory.stream().forEach { it.printList("$preFix/name") }
    }
}
