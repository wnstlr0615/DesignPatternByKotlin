package part03.prototype

class UnderlinePen(
    private val ulchar: Char
) : Product {
    override fun use(s: String) {
        val length = s.length
        println("\\ $s \\")
        for(i in 0 until length){
            print(ulchar)
        }
        println()
    }

    override fun createClone(): Product? {
        var p: Product? = null
        try{
            p = clone() as Product
        }catch (e: CloneNotSupportedException){
            e.printStackTrace()
        }
        return p
    }
}