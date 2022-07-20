package part04.bridge

class StringDisplayImpl(
    private val string: String,
) : DisplayImpl {
    private val width: Int = string.length

    override fun rawOpen() {
        printLine()
    }

    private fun printLine() {
        print("+")
        repeat(width) {
            print("-")
        }
        println("+")
    }

    override fun rawPrint() {
        println("| $string |")
    }

    override fun rawClose() {
        printLine()
    }
}
