package part02.template

abstract class AbstractDisplay {
    abstract protected fun open_()
    abstract protected fun print_()
    abstract protected fun close_()
    fun display(){
        open_()
        repeat(5){ print_()}
        close_()
    }
}