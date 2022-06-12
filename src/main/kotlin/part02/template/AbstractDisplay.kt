package part02.template

abstract class AbstractDisplay {
    abstract fun open_()
    abstract fun print_()
    abstract fun close_()
    fun display(){
        open_()
        repeat(5){ print_()}
        close_()
    }
}