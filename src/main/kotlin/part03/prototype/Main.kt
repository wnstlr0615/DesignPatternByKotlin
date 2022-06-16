package part03.prototype

fun main() {
    val manager = Manager()
    val upen = UnderlinePen('~')
    val mbox = MessageBox('*')
    val sbox = MessageBox('/')
    manager.register("strong message", upen)
    manager.register("waring box", mbox)
    manager.register("slash box", sbox)

    //생성
    val p1 = manager.create("strong message")
    p1.use("hello, world.")
    val p2 = manager.create("waring box")
    p2.use("hello, world.")
    val p3 = manager.create("slash box")
    p3.use("hello, world.")
}