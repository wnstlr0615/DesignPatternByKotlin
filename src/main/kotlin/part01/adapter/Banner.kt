package part01.adapter

open class Banner (
    private val str: String
){
    fun showWithParen() = println("( $str )")
    fun showWithAster() = println("* $str *")
}