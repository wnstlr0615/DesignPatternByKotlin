package part02.template

class StringDisplay(
    private val str: String,
) : AbstractDisplay(){
    override fun open_() {
        printLine()
    }

    override fun print_() {
        print("| ")
        print(str)
        println(" |")
    }

    override fun close_() {
        printLine()

    }
    private fun printLine() {
        print("+")
        repeat(str.length + 2){
            print("-")
        }
        println("+")
    }
}