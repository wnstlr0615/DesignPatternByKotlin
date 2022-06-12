package part02.template

class CharDisplay(
    private val c: Char
) : AbstractDisplay(){
     override fun open_() {
        print("<<")
    }

    override fun print_() {
        print(c)
    }

    override fun close_() {
        println(">>")
    }
}