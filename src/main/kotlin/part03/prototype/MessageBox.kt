package part03.prototype

class MessageBox(
    private val decochar: Char
) : Product {
    override fun use(s: String) {
        val length = s.length
        printLine(length)
        println("$decochar $s $decochar")
        printLine(length)
    }

    private fun printLine(length: Int) {
        for (i in 0 until length + 4) {
            print(decochar)
        }
        println()
    }

    override fun createClone(): Product? {
        var p : Product? = null
        try{
            p = clone() as Product
        }catch (e : CloneNotSupportedException){
            e.printStackTrace()
        }
        return p
    }
}