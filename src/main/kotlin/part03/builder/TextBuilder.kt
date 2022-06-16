package part03.builder

class TextBuilder (
    val buffer: StringBuffer = StringBuffer()
) : Builder{
    override fun makeTitle(title: String) {
        buffer.append("==========================\n")
        buffer.append("『 $title 』\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■ $str \n")
        buffer.append("\n")
    }

    override fun makeItems(items: Array<String>) {
        for (item in items) {
            buffer.append("ㆍ $item \n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("==========================\n")
    }
    fun getResult() = buffer.toString()
}