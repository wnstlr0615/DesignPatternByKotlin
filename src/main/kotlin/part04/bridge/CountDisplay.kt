package part04.bridge

class CountDisplay(
    impl: DisplayImpl
) : Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        for (i in 0 until times) {
            print()
        }
        close()
    }
}
