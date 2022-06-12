package part01.adapter.delegation

// 위임 어댐터
fun main() {
    val p = PrintBannerDelegation("joon")
    p.printWeak()
    p.printStrong()
}